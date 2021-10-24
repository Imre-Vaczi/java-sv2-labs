package looptypesmodify;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> data = new ArrayList(Arrays.asList());
        Student student_01 = new Student("Eva");
        Student student_02 = new Student("Anna");
        Student student_03 = new Student("Hazel");
        Student student_04 = new Student("Bella");
        data.add(student_01);
        data.add(student_02);
        data.add(student_03);
        data.add(student_04);

        System.out.println("Active students in class: "+data.size());

        student_04.setActive(false);

        List<Student> forDeletion = new ArrayList(Arrays.asList());
        for (Student element: data){
            if (element.getActive() != true){
                forDeletion.add(element);
            }
        }

        data.removeAll(forDeletion);
        System.out.println("Active students in class after revision: "+data.size());
    }
}
