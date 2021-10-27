package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person_01 = new Person("Eva", 21);
        Person person_02 = person_01;

        person_02.setName("Ada");

        System.out.println(person_01.getName());
        System.out.println(person_02.getName());

        int a = 24;
        int b = a;
        b += 1;

        System.out.println(a + " " +b);

        person_02 = new Person("Boo", 17);
        System.out.println(person_01.getName());
        System.out.println(person_02.getName());
    }

}
