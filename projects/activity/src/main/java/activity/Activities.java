package activity;

import java.util.*;

public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Report> distancesByTypes() {
        return createReports(mapResults());
    }

    private List<Report> createReports(Map<ActivityType, Double> rawData) {
        List<Report> result = new ArrayList<>();
        for (Map.Entry<ActivityType, Double> entry : rawData.entrySet()) {
            result.add(new Report(entry.getKey(), entry.getValue()));
        }
        return result;
    }

    private Map<ActivityType, Double> mapResults() {
        Map<ActivityType, Double> results = new LinkedHashMap<>();
        results.put(ActivityType.BIKING, 0.0);
        results.put(ActivityType.HIKING, 0.0);
        results.put(ActivityType.RUNNING, 0.0);
        results.put(ActivityType.BASKETBALL, 0.0);
        for (Activity act : activities) {
            results.put(act.getType(), results.get(act.getType()) + act.getDistance());
        }
        return results;
    }

    public int numberOfTrackActivities() {
        return activities.stream()
                .map(a -> a.getType())
                .distinct()
                .toList()
                .size();
    }

    public int numberOfWithoutTrackActivities() {
        return activities.stream()
                .filter(a -> a instanceof ActivityWithoutTrack)
                .toList()
                .size();
    }
}
