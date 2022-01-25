package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {

    private Map<String, Integer> paymentTracker  = new HashMap<>();

    public Map<String, Integer> getPaymentTracker() {
        return paymentTracker;
    }

    public void loadInPayments(Path path) {
        for (String line : readData(path)) {
            String laKey = line.split(": ")[0];
            Integer laValue = Integer.parseInt(line.split(": ")[1]);
            paymentTracker.put(laKey, laValue);
        }
    }

    public List<String> readData(Path path) {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(path);
        }
        catch (IOException ioException) {
            throw new IllegalStateException("File can not be read.", ioException);
        }
        return result;
    }
}
