package collectionscomp;

import java.text.CollationKey;
import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {

        Set<Student> kids = new TreeSet<>(new StudentComparator());

        Student first = new Student("Ö", 160);
        Student second = new Student("É", 170);
        Student third = new Student("Á", 150);

        kids.add(second);
        kids.add(first);
        kids.add(third);

        System.out.println(kids);

        Map<String, Integer> database = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        database.put(second.getName(), second.getHeight());
        database.put(first.getName(), first.getHeight());
        database.put(third.getName(), third.getHeight());

        System.out.println(database);
    }
}
