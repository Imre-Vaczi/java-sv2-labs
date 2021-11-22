package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {

    public List<String> readNames(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioException) {
            throw new IllegalStateException("Error while reading"+path, ioException);
        }
        finally {
            System.out.println("End of reading.");
        }
    }

    private String printFirstDr(List<String> names) {
        for (String person : names) {
            if (person.startsWith("dr")) {
                return person;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Names names = new Names();
        Path pathFrom = Paths.get("src/test/resources/names.txt");
        System.out.println(names.printFirstDr(names.readNames(pathFrom)));
    }
}
