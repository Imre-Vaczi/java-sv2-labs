package algorithmssum.school;

import java.util.List;

public class School {

    public int getNumberOfStudents(List<Integer> headcounts) {
        int result = 0;
        for (Integer headsPerClass : headcounts) {
            result += headsPerClass;
        }
        return result;
    }
}
