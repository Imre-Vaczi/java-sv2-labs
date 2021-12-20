package interfacedefaultmethods.words;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations{

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    public Path getPath() {
        return path;
    }

    @Override
    public List<String> readFromFile(Path path) {
        return FileOperations.super.readFromFile(path);
    }

    @Override
    public String getLongWord() {
        StringBuilder sb = new StringBuilder();
        for (String line : readFromFile(path)) {
            if (line.equals("WORD")) {
                sb.append(line);
            } else {
                sb.append(line.charAt(0));
            }
        }
        return sb.toString();
    }
}
