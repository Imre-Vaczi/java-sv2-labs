package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {

    public String getFirstWordWithA(Path path){
        for (String item : readFile(path)) {
            if (item.startsWith("A")) {
                return item;
            }
        }
        return "A";
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe){
            throw new IllegalStateException("Error occurred during reading.", ioe);
        }
    }
}
