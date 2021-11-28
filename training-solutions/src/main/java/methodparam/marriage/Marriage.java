package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man) {
        woman.addOccasion("házasságkötés", LocalDate.now());
        man.addOccasion("házasságkötés", LocalDate.now());
        modToMarried(woman,man.getName().split(" ")[0] + "né");
    }

    private void modToMarried(Woman woman, String extraName) {
        woman.setName(extraName + " " + woman.getName());
    }
}
