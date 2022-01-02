package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    private ClassRecords classRecords = new ClassRecords("Class", new Random(5));
    private List<Subject> subjects = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();

    public void innit() {
        subjects.add(new Subject("CS"));
        subjects.add(new Subject("Mathematics"));
        subjects.add(new Subject("Biology"));
        subjects.add(new Subject("Ecology"));

        tutors.add(new Tutor("Alan Turing", Arrays.asList(new Subject("CS"), new Subject("Mathematics"))));
        tutors.add(new Tutor("Aldo Leopold", Arrays.asList(new Subject("Biology"), new Subject("Ecology"))));

    }

    public Subject getSubject(String description) {
        if (isEmpty(description)) {
            throw new IllegalArgumentException("Subject description must not be empty!");
        }
        if (subjects.size()==0) {
            throw new ArithmeticException("No subjects in the list yet!");
        }
        for (Subject subject : subjects) {
            if (description.equals(subject.getSubjectName())) {
                return subject;
            }
        }
        return null;
    }

    public Tutor getTutor(String description) {
        if (isEmpty(description)) {
            throw new IllegalArgumentException("Tutor name must not be empty!");
        }
        if (tutors.size()==0) {
            throw new ArithmeticException("No tutor in the list yet!");
        }
        for (Tutor tutor : tutors) {
            if (description.equals(tutor.getName())) {
                return tutor;
            }
        }
        return null;
    }

    public void runMenu() {
        System.out.println("Melyik menüpontot választod?");
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int menuCode = Integer.parseInt(scanner.nextLine());

        while (menuCode != 11) {
            printMenu();
            switch (menuCode) {
                case 1:
                    runFirstOpt();
                    break;
                case 2:
                    runSecondOpt();
                    break;
                case 3:
                    runThirdOpt();
                    break;
                case 4:
                    runForthOpt();
                    break;
                case 5:
                    runFifthOpt();
                    break;
                case 6:
                    runSixthOpt();
                    break;
                case 7:
                    runSeventhOpt();
                    break;
                case 8:
                    runEightOpt();
                    break;
                case 9:
                    runNinthOpt();
                    break;
                case 10:
                    runTenthOpt();
                    break;
                default:
                    System.out.println("Érvénytelen menüpont!");
            }
        }
        System.out.println("Osztálynapló lezárva.");
    }

    private void printMenu() {
        System.out.println("1. Diákok nevének listázása\n" +
                "2. Diák név alapján keresése\n" +
                "3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n" +
                "5. Diák feleltetése\n" +
                "6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n" +
                "8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n" +
                "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "11. Kilépés");
    }

    private boolean isEmpty(String str) {
        return (str == null | str.length() == 0);
    }

    private String runFirstOpt() {
        return classRecords.listStudentNames();
    }

    private Student runSecondOpt() {
        System.out.println("Keresendő tanuló neve?");
        Scanner scanner = new Scanner(System.in);
        return classRecords.findStudentByName(scanner.nextLine());
    }

    private void runThirdOpt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rögzítendő tanuló neve?");
        String name = scanner.nextLine();
        Student toAdd = new Student(name);
        classRecords.addStudent(toAdd);
    }

    private void runForthOpt() {
        System.out.println("Rögzítendő tanuló neve?");
        Scanner scanner = new Scanner(System.in);
        classRecords.removeStudent(classRecords.findStudentByName(scanner.nextLine()));
    }

    private void runFifthOpt() {
        Scanner scanner = new Scanner(System.in);
        Student reportingStudent = classRecords.repetition();

        System.out.println("Rögzítendő tanuló neve?");
        String grading = scanner.nextLine();

        System.out.println("Tantárgy megnevezése?");
        String topic = scanner.nextLine().toLowerCase();

        System.out.println("Oktató neve?");
        String teacher = scanner.nextLine();

        Student reporting = classRecords.repetition();
        reporting.grading(new Mark(grading, getSubject(topic), getTutor(teacher)));
    }

    private void runSixthOpt() {
        System.out.println(classRecords.calculateClassAverage());
    }

    private void runSeventhOpt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tantárgy megnevezése?");
        String topic = scanner.nextLine();
        System.out.println(classRecords.calculateClassAverageBySubject(getSubject(topic)));
    }

    private void runEightOpt() {
        System.out.println(classRecords.listStudentNames());
    }

    private void runNinthOpt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tanuló neve?");
        String student = scanner.nextLine();
        System.out.println(classRecords.findStudentByName(student).calculateAverage());
    }

    private void runTenthOpt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tanuló neve?");
        String student = scanner.nextLine();
        System.out.println("Tantárgy megnevezése?");
        String topic = scanner.nextLine();
        System.out.println(classRecords.findStudentByName(student).calculateSubjectAverage(getSubject(topic)));
    }

    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.innit();
        schoolRecordsController.runMenu();
    }
}
