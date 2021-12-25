package exceptions.measurement;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    Measurement measurement = new Measurement();

    @Test
    void testReadFromFile(){
        Path path = Paths.get("src/test/resources/measurementdata.csv");
        List<String> rawInput = measurement.readFromFile(path);

        assertEquals(11, rawInput.size());
    }

    @Test
    void testReadFromFileInvalid(){
        Path path = Paths.get("src/test/resources/invalidPathData.csv");
        Exception exception = assertThrows(IllegalStateException.class,
                ()-> measurement.readFromFile(path));

        assertEquals("Error, file can not be read!", exception.getMessage());
    }

    @Test
    void testValidate() {
        Path path = Paths.get("src/test/resources/measurementdata.csv");
        List<String> rawInput = measurement.readFromFile(path);
        List<String> errorReport = measurement.validate(rawInput);

        assertEquals(8, errorReport.size());
    }
}