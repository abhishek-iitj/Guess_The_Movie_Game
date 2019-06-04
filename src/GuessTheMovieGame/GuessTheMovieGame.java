package GuessTheMovieGame;

import java.util.Scanner;

public class GuessTheMovieGame {
    private String movieName;
    private Integer pointsLost;
    private String guessed;
    public GuessTheMovieGame(String fileName){
        PickRandomMovie pickRandomMovie;
        pickRandomMovie = new PickRandomMovie(fileName);
        movieName = pickRandomMovie.pickRandomMovie();
        pointsLost = 0;
        guessed = "";
        for (Integer i=0; i<movieName.length(); i++){
            if(movieName.charAt(i)!=' ') {
                guessed += "_";
            }
            else{
                guessed += ' ';
            }
        }
    }
    public void play(){
        while(pointsLost<10 && !guessed.equals(movieName)){
            System.out.println("You are guessing: " + guessed);
            System.out.println("You have guessed ("+(pointsLost)+") wrong letters");
            System.out.println("Guess a letter:");
            Scanner reader = new Scanner(System.in);
            char input = reader.next(".").charAt(0);
            Boolean found = false;
            for (Integer i=0; i<guessed.length(); i++){
                if(movieName.charAt(i)==input) {
                    guessed = guessed.substring(0, i)+movieName.charAt(i)+guessed.substring(i+1);
                    found = true;
                }
            }
            if(!found) {
                pointsLost++;
            }
        }
        if(pointsLost>=10){
            System.out.println("You lost the game!");
        }else {
            System.out.println("Congratulations, You Won!");
        }
    }
}
