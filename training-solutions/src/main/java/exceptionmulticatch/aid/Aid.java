package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        try {
            List<String> rawData = readFromPath(path);

            for (String line : rawData) {
                result.add(calculate(line));
            }
            return result;
        } catch (NullPointerException | IOException | ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException exception) {
            throw new IllegalStateException("Something went wrong while counting.", exception);
        }
    }

    private String calculate(String line) {
        return line.split(" ")[0] + " " + (amount / Integer.parseInt(line.split(" ")[1]));
    }

    private List<String> readFromPath(Path path) throws IOException {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioException) {
            throw new IOException("Something went wrong while counting.", ioException);
        }
    }
}
