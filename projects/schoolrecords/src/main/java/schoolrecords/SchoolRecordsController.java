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

    public void printMenu() {
        System.out.println("1. Diákok nevének listázása\n" +
                "2. Diák név alapján keresése\n" +
                "3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n" +
                "5. Diák feleltetése\n" +
                ". Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n" +
                "8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n" +
                "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "11. Kilépés");
    }

    public void runMenu() {
        System.out.println("Melyik menüpontot választod?");
        Scanner scanner = new Scanner(System.in);
        int menuCode = scanner.nextInt();
        scanner.nextLine();

        do {
            switch (menuCode) {
                case 1:
                    runFirstOpt();
                    break;
                case 2:
                    runSecondOpt();
                    break;
                case 3:
                    runThirdOpt();
                default:
                    System.out.println("Érvénytelen menüpont!");
            }
        } while (menuCode != 11);
    }

    public String runFirstOpt() {
        return classRecords.listStudentNames();
    }

    public Student runSecondOpt() {
        System.out.println("Keresendő tanuló neve?");
        Scanner scanner = new Scanner(System.in);
        return classRecords.findStudentByName(scanner.nextLine());
    }

    public void runThirdOpt() {
        System.out.println("Rögzítendő tanuló neve?");
        Scanner scanner = new Scanner(System.in);
        classRecords.addStudent(new Student(scanner.nextLine()));
    }

    public void runForthOpt() {
        System.out.println("Rögzítendő tanuló neve?");
        Scanner scanner = new Scanner(System.in);
        classRecords.removeStudent(classRecords.findStudentByName(scanner.nextLine()));
    }

/*    public void runFifthOpt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Felelet eredménye?");
        int result = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tantárgy megnevezése?");
        String topic = scanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Oktató neve?");
        String teacher = scanner.nextLine();
        Mark mark = new Mark()
    }*/

    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.innit();
    }

}
