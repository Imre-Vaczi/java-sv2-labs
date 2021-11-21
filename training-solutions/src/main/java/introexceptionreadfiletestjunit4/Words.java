package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Words {

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioException){
            throw new IllegalStateException("Beolvasás sikertelen.", ioException);
        }
    }

    public String getFirstWordWithA(Path path) {
        List<String> data = readFile(path);
        for (String item : data){
            if (item.startsWith("A")){
                return item;
            }
        }return "A";
    }

}
