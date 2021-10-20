package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime beginEmployment;
    private int year;
    private int month;
    private int day;

    public Employee(int year, int month, int day, String name){
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.beginEmployment = LocalDateTime.now();
        this.dateOfBirth = LocalDate.of(year, month, day);
    }

    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String getName(){
        return this.name;
    }

    public LocalDateTime getBeginEmployment() {
        return this.beginEmployment;
    }

    public void setName(String otherName){
        this.name = otherName;
    }
}
