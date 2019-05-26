import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class PickRandomMovie {
    private ArrayList<String> movies = new ArrayList<String>();
    private String fileName;

    public PickRandomMovie(String fileName){
        System.out.println("filename is" + fileName);
        this.fileName = fileName;
    }

    private void readMovieNamesFromFile() throws IOException {
        try{
            BufferedReader abc = new BufferedReader(new FileReader(fileName));
            String s;
            while((s=abc.readLine())!=null) {
                movies.add(s);
                System.out.println(s);
            }
            abc.close();
        } catch(IOException ex){
            System.out.println(ex.toString());
        }
    }

    public String pickRandomMovie(){
        try {
            this.readMovieNamesFromFile();
            Random rand = new Random();
            int randomIndex = rand.nextInt((movies.size() - 0) + 1) + 0;
            System.out.println("random index" + randomIndex);
            String randomMovie = movies.get(randomIndex);
            System.out.println(randomMovie);
            return randomMovie;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
