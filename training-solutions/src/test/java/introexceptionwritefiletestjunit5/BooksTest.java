package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File temporaryFolder;

    @Test
    void testWriteFile() throws IOException {
        Books books = new Books();
        Path pathFrom = Paths.get("src/test/resources/books.txt");
        Path pathTo = temporaryFolder.toPath().resolve("booksFinal.txt");
        books.writeFile(pathFrom, pathTo);
        List<String> toTest = Files.readAllLines(pathTo);
        assertEquals("Gárdonyi Géza: Egri csillagok", toTest.get(0));
    }
}