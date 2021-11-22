package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electricity {

    private List<String> rawList = Arrays.asList("A st");

    public void writeStreets(Path path) {
        try {
            Files.write(path, getListOfStreet());
        }
        catch (IOException ioException) {
            throw new IllegalStateException("Error while writing content.", ioException);
        }
    }

    private List<String> getListOfStreet() {
        List<String> temp = new ArrayList<>();
        for (String street : rawList) {
            temp.add(LocalDate.now().toString() + ": " + street);
        }
        return temp;
    }
}
