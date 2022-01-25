package collectionscomp;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.valueOf(o1.getHeight()).compareTo(o2.getHeight());
    }
}
