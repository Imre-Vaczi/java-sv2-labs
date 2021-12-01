package constructoroverloading.bus;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public int getDifference(SimpleTime time) {
        LocalTime actual = LocalTime.of(this.hours, this.minutes);
        LocalTime other = LocalTime.of(time.getHours(), time.getMinutes());
        int diff = (int) actual.until(other, ChronoUnit.MINUTES);
        return diff;
    }

    public String toString() {
        return this.hours + "h : " + this.minutes + "m";
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    private int convertToNextDay(int minutes) {
        if (minutes < 0) {
            return minutes * -1 + 24 * 60;
        } else {
            return minutes;
        }
    }
}
