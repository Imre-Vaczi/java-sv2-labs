package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {
        List<String> content = new ArrayList<>();
        List<String> nepCodes = new ArrayList<>();
        Neptun neptun = new Neptun();

        try {
            content = neptun.readContent("src/test/resources/neptun.csv");
        }
        catch (IOException ioException) {
            System.out.println("Tartalom beolvasása hibára futott.");
            ioException.printStackTrace();
        }

        System.out.println(nepCodes = neptun.collectCodes(content));
    }

    public List<String> readContent(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }

    public List<String> collectCodes(List<String> listToCheck){
        List<String> result = new ArrayList<>();
        for (String item : listToCheck) {
            result.add(item.substring(item.indexOf(",")+1));
        }
        return result;
    }
}
