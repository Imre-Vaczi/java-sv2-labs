package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {

    public List<String> readPoem(String filePath){
        try {
            return Files.readAllLines(Paths.get(filePath));
        }
        catch(IOException ioe){
            throw new IllegalStateException("Content can not be read.", ioe);
        }
    }

    public String printFirstLetters(List<String > listToPrint){
        StringBuilder sb = new StringBuilder();
        for (String row : listToPrint) {
            sb.append(row.charAt(0));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Poem poem = new Poem();
        try {
            String result = poem.printFirstLetters(poem.readPoem("poem.txt"));
            System.out.println(result);
        }
        catch (IllegalStateException ise){
            ise.getCause().printStackTrace();
        }

    }
}
