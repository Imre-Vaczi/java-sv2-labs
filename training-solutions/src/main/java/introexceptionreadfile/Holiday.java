package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {
        try {
            List<String> content = Files.readAllLines(Paths.get("src/test/resources/holiday.txt"));
            System.out.println(content);
        }
        catch (IOException ioException) {
            System.out.println("Tartalom beolvasása sikertelen");
            ioException.printStackTrace();
        }
    }

}
