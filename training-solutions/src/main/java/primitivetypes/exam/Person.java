package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birtOfDate;
    private int zip;
    private double avg;

    public String toString(){
        return name + " - " + birtOfDate + " - " + zip + " - " + avg;
    }

    public Person(String name, LocalDate birtOfDate, int zip, double avg) {
        this.name = name;
        this.birtOfDate = birtOfDate;
        this.zip = zip;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirtOfDate() {
        return birtOfDate;
    }

    public int getZip() {
        return zip;
    }

    public double getAvg() {
        return avg;
    }
}
