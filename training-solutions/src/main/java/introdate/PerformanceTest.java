package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {

        String artist = "Queen";
        LocalDate date;
        LocalTime startTime;
        LocalTime endTime;
        int year = 1989;
        int month = 6;
        int day = 2;
        int hourStart = 18;
        int minuteStart = 0;
        int hourEnd = 20;
        int minuteEnd =0 ;

        Performance performance = new Performance(artist,year,month,day,hourStart,minuteStart,hourEnd,minuteEnd);

        System.out.println(performance.getArtist());
        System.out.println(performance.getDate());
        System.out.println(performance.getStartTime());
        System.out.println(performance.getEndTime());
        System.out.println(performance.getInfo());
        }
    }
