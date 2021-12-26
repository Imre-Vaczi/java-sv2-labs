package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    @Test
    void testGetFullNames() {
        Siblings siblings = new Siblings();
        Path path = Paths.get("src/test/resources/siblings.txt");
        List<String> result = siblings.getFullNames("Szabó", path);

        assertEquals("[Szabó Emese, Szabó Ferenc]", result.toString());
    }

}