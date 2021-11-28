package methodparam.marriage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Man {
    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public void addOccasion(String event, LocalDate date) {
        registerDates.add(new RegisterDate("marrige", date));
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
