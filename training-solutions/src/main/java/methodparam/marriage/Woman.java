package methodparam.marriage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Woman {
    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public void addOccasion(String event, LocalDate date) {
        registerDates.add(new RegisterDate("marrige", date));
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }

    public String getName() {
        return name;
    }
}
