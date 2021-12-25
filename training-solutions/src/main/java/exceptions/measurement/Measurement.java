package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error, file can not be read!", ioe);
        }
    }

    public List<String> validate(List<String> rawData) {
        List<String> result = new ArrayList<>();
        for (String line : rawData) {
            String[] input = line.split(",");
            if (checkLineLenght(input) || checkMeasurement(input) || checkSerial(input) || checkRecorder(input)) {
                result.add(line);
            }
        }
        return result;
    }

    private boolean checkSerial(String[] input) {
        try {
            int serial = Integer.parseInt(input[0]);
            return false;
        } catch (NumberFormatException nfe) {
            return true;
        }
    }

    private boolean checkMeasurement(String[] input) {
        try {
            double record = Double.parseDouble(input[1]);
            return false;
        } catch(NumberFormatException nfe) {
            return true;
        }
    }

    private boolean checkRecorder(String[] input) {
        return (input[2].split(" ").length < 2);
    }

    private boolean checkLineLenght(String[] input) {
        return (input.length != 3);
    }

    public static void main(String[] args) {
        Measurement measurement = new Measurement();
/*        Path path = Paths.get("src/test/resources/measurementdata.csv");
        List<String> rawInput = measurement.readFromFile(path);
        List<String> errorReport = measurement.validate(rawInput);
        System.out.println(errorReport);*/

        String a = "1,12.4,John Doe";
        String[] b = a.split(",");
        System.out.println(measurement.checkSerial(b));
        System.out.println(measurement.checkMeasurement(b));
        System.out.println(measurement.checkRecorder(b));
        System.out.println(measurement.checkLineLenght(b));
/*        System.out.println(b[2].split(" "));
        System.out.println(b[2].split(" ").length < 2);*/

    }
}
