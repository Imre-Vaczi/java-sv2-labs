package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
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
