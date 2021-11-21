package introexceptioncause;

import java.util.ArrayList;
import java.util.List;

public class Tracking {
    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();
        List<Integer> elevationDifferences = new ArrayList<>();

        try {
            elevationDifferences = trackPoints.calculateElevDiff(trackPoints.readElevation(trackPoints.readFile("tracking.csv")));
        }
        catch (IllegalStateException ise){
            ise.printStackTrace();
            ise.getCause().printStackTrace();
        }

        for (Integer diff : elevationDifferences){
            System.out.println(diff);
        }
    }
}
