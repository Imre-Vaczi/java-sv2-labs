package looptypes;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class StudyGroup {

    public void printStudyGroups(List<String> students){
        List<String> group_1 = new ArrayList(Arrays.asList());
        List<String> group_2 = new ArrayList(Arrays.asList());

        for (String person: students){
            if (person.length() > 10){
                group_2.add(person);
            } else{
                group_1.add(person);
            }
        }
        System.out.println("Group 1: " + group_1);
        System.out.println("Group 2: " + group_2);
    }

    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        List<String> students = new ArrayList(Arrays.asList("Michael Moorer", "Evander Holyfield", "Carlos de León","Roberto Balado","Mohamed Reza Kalkh Samadi","Riddick Bowe", "Buster Douglas", "David Tua", "Oleg Maskaev"));
        studyGroup.printStudyGroups(students);
    }

}
