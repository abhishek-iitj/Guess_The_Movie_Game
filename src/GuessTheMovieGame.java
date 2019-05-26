public class GuessTheMovieGame {
    private String movieName;
    private Integer pointsLost;
    private String guessed;
    public GuessTheMovieGame(String fileName){
        PickRandomMovie pickRandomMovie;
        pickRandomMovie = new PickRandomMovie(fileName);
        movieName = pickRandomMovie.pickRandomMovie();
        System.out.println("picked movie" + movieName);
        pointsLost = 0;
        guessed = "";
        for (Integer i=0; i<movieName.length(); i++){
            guessed += "_";
        }
        System.out.println(guessed.length());
    }
}
