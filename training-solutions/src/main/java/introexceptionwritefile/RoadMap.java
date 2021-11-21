package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {
        List<String> itiner = Arrays.asList("Budapest", "Cegléd", "Kecskemét", "Nyíregyháza", "Szeged");

        try {
            Files.write(Paths.get("src/main/resources/itiner.txt"), itiner);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error during writing procedure", ioe);
        }
    }

}
