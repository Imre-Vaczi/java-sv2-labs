package interfacedefaultmethods.words;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public interface FileOperations {

    default List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioException) {
            throw new IllegalStateException("File can not be read", ioException);
        }
    }

    abstract String getLongWord();

}
