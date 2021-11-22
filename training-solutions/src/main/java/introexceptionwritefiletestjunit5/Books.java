package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> formatRows(List<String> inputList) {
        List<String> result = new ArrayList<>();
        for (String line : inputList) {
            result.add(line.split(";")[2] + ": " + line.split(";")[1]);
        }
        return result;
    }

    private List<String> readFile(Path pathFrom) {
        try {
            return Files.readAllLines(pathFrom);
        }
        catch (IOException ioException) {
            throw new IllegalStateException("Error while reading " + pathFrom, ioException);
        }
    }

    public void writeFile(Path pathFrom, Path pathTo) {
        try {
            Files.write(pathTo, formatRows(readFile(pathFrom)));
        }
        catch (IOException ioException) {
            throw new IllegalStateException("Error while writing to "+ pathTo, ioException);
        }
    }
}
