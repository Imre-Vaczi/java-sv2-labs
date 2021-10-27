package introconstructors;
import java.time.LocalDate;
import java.util.Date;
public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime){
        this.description = description;
        this.startTime = startTime;
    }

    public void registerPerson(int person){
        this.numberOfPeople += person;
    }

    public void ride(double km){
        this.kms += km;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("joyride", LocalDate.of(2021, 10, 27));
        System.out.println("Title - Date - Cumulated distance - Participants");
        System.out.println(cyclingTour.getDescription()+" - "+ cyclingTour.startTime + " - " + cyclingTour.getKms()+ " - "+ cyclingTour.getNumberOfPeople());
        for (int i = 0; i < Math.random()*10; i++){
            cyclingTour.registerPerson(1);
            cyclingTour.ride(Math.random()*100.0);
        }
        System.out.println(cyclingTour.getDescription()+" - "+ cyclingTour.startTime + " - " + Math.round(cyclingTour.getKms())*1.0 + " - "+ cyclingTour.getNumberOfPeople());
    }
}
