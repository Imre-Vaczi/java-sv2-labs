package exceptionclass.course;

import java.util.ArrayList;
import java.util.List;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        if (!checkHour(hour)) {
            throw new InvalideTimeException("Hour is invalid (0-23)");
        }
        if (!checkMuinute(minute)) {
            throw new InvalideTimeException("Minute is invalid (0-59)");
        }
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String hhmm) {
        if (hhmm == null) {
            throw new InvalideTimeException("Time is null");
        }
        if (!checkValidString(hhmm)) {
            throw new InvalideTimeException("Time is not hh:mm");
        }
        if (!checkCharValidity(hhmm)) {
            throw new InvalideTimeException("Time is not hh:mm");
        }

        this.hour = Integer.parseInt(hhmm.split(":")[0]);
        this.minute = Integer.parseInt(hhmm.split(":")[1]);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    private boolean checkHour(int hour) {
        if (hour >= 0 & hour <= 23) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkMuinute(int minute) {
        if (minute >= 0 & minute <= 59) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkNotNull(String hhmm) {
        return !(hhmm.equals(null));
    }

    private boolean checkValidString(String hhmm) {
        return ((hhmm.length()==5) & (hhmm.charAt(2)==':'));
    }

    private boolean checkCharValidity(String hhmm) {
        List<Boolean> result = new ArrayList<>();
        for (Character s : hhmm.toCharArray()) {
            if (s.equals(':')) {
                result.add(true);
            } else {
                try {
                    Integer.parseInt(String.valueOf(s));
                    result.add(true);
                } catch (NumberFormatException nfe) {
                    result.add(false);
                }
            }
        }
        return !result.contains(false);
    }
}
