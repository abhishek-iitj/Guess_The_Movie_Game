public class Main {
    public static void main(String[] args) {
        System.out.println("Guess the movie game");
        GuessTheMovieGame guessTheMovieGame = new GuessTheMovieGame(System.getProperty("user.dir") + "/src/movies.txt");
        System.out.println(System.getProperty("user.dir") + "/src/movies.txt");
        guessTheMovieGame.play();
    }
}
