package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {
    private String artist;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private int year;
    private int month;
    private int day;
    private int hourStart;
    private int minuteStart;
    private int hourEnd;
    private int minuteEnd;

    public Performance(String artist, int year, int month, int day, int hourStart, int minuteStart, int hourEnd, int minuteEnd){
        this.artist = artist;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hourStart = hourStart;
        this.minuteStart = minuteStart;
        this.hourEnd = hourEnd;
        this.minuteEnd = minuteEnd;
        this.date = LocalDate.of(year, month, day);
        this.startTime = LocalTime.of(hourStart, minuteStart);
        this.endTime = LocalTime.of(hourEnd, minuteEnd);
    }

    Performance performance = new Performance(artist,year,month,day,hourStart,minuteStart,hourEnd,minuteEnd);

    public String getArtist(){
        return this.artist;
    }
    public LocalDate getDate(){
        return this.date;
    }
    public LocalTime getStartTime(){
        return this.startTime;
    }
    public LocalTime getEndTime(){
        return this.endTime;
    }
    public String getInfo(){
        return artist + ": " + performance.getDate() + " " + performance.getStartTime() + " - " + performance.getEndTime();
    }

}
