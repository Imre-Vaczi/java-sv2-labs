package defaultconstructor;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (isCorrect(year,month,day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    private boolean isCorrect(int year, int month, int day) {
        if (
                (year < 1900) ||
                (month < 1) ||
                (month > 12) ||
                (day < 1) ||
                (calculateMonthLength(year,month)) < day) {
            throw new IllegalArgumentException("Date can not be set up due to inadequate components.");
        } else {
            return true;
        }
    }

    private boolean isLeapYear(int year) {
        if (((year % 4 == 0) &&
                !(year % 100 == 0))
                || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    private int calculateMonthLength(int year, int month) {
        switch (month) {
            case 1, 3 ,5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
