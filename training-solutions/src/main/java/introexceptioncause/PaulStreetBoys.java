package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PaulStreetBoys {

    public List<String> readContent(String filePath){
        try {
            return Files.readAllLines(Paths.get(filePath));
        }
        catch(IOException ioe){
            throw new IllegalStateException("Content can not be read.", ioe);
        }
    }

    public List<String> modifyContent(List<String> listToMod){
        List<String> result = new ArrayList<>();
        for (String name : listToMod){
            if (name.equals("Nemecsek Ernő")){
                result.add(name.toLowerCase(Locale.ROOT));
            }else{
                result.add(name);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        try {
            System.out.println(paulStreetBoys.modifyContent(paulStreetBoys.readContent("src/test/resources/palutcaifiuk.txt")));
        }
        catch (IllegalStateException ise) {
            ise.getCause().printStackTrace();
        }
    }
}
