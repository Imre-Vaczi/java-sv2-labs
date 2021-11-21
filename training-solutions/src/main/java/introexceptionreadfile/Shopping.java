package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Shopping {

    public static void main(String[] args) {
        try {
            List<String> grocery = Files.readAllLines(Paths.get("src/test/resources/shoppinglist.txt"));
            System.out.println(grocery);
        }
        catch (IOException ioException) {
            System.out.println("Tartalom beolvasása nem lehetséges.");
            ioException.printStackTrace();
        }
    }
}
