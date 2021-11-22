package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @TempDir
    File temporaryFolder;

    @Test
    void testWriteStreets() throws IOException {
        Path path = temporaryFolder.toPath().resolve("streetList.txt");
        System.out.println(path);
        new Electricity().writeStreets(path);
        List<String> theLines = Files.readAllLines(path);
        assertEquals(Arrays.asList(LocalDate.now().toString()+": "+"A st"), theLines);
    }

}