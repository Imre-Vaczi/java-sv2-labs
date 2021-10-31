package stringbasic.university;

public class UniversityMain {
    public static void main(String[] args) {
        University university = new University();
        university.addStudent(new Student(new Person("personA","personA@mail.com","300300300","1000-1000-1000","705002040"),"1000","2000"));
        university.addStudent(new Student(new Person("personB","personB@mail.com","300300301","1000-1000-1001","705002041"),"1001","2001"));
        university.addStudent(new Student(new Person("personA","personA@mail.com","300300300","1000-1000-1000","705002040"),"1000","2000"));
        System.out.println(university.areEqual(university.getStudents().get(0), university.getStudents().get(1)));
        System.out.println(university.areEqual(university.getStudents().get(0), university.getStudents().get(2)));
    }

}
