package methodoverloading;

import java.time.LocalTime;

public class Time {

    private LocalTime localTime;

    public Time(LocalTime localTime) {
        this.localTime = localTime;
    }

    public boolean isEqual(Time time) {
        if (localTime.equals(time)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        if (localTime.equals(LocalTime.of(hours, minutes, seconds))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEarlier(Time time) {
        if (localTime.isBefore(time.getLocalTime())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        if (localTime.isBefore(LocalTime.of(hours,minutes,seconds))) {
            return true;
        } else {
            return false;
        }
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }
}
