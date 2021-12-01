package constructoroverloading.bus;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        for (int h = firstHour; h <= lastHour; h++) {
            for (int m = 0; m < 60; m += everyMinute) {
                timeTable.add(new SimpleTime(h, m));
            }
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actual) {
        if (checkTimeTable(actual) != null) {
            return checkTimeTable(actual);
        } else {
            throw new IllegalStateException("There are no more departures today.");
        }
    }

    private SimpleTime checkTimeTable(SimpleTime actual) {
        SimpleTime temp = null;
        for (SimpleTime sp : timeTable) {
            if (actual.getDifference(sp) > 0) {
                temp = sp;
                return temp;
            }
        }
        return temp;
    }
}
