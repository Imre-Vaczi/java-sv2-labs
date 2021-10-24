package finalmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Week {
    public static final List<String> daysOfWeek = new ArrayList(Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"));

    public static void main(String[] args) {
        System.out.println("Before: " + daysOfWeek.toString());
        daysOfWeek.set(1,"Szerda");
        System.out.println("After: " + daysOfWeek.toString());
    }
}
