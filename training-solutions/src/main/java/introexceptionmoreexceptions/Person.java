package introexceptionmoreexceptions;

import java.util.Locale;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person: " +"name = " + name + ", age = " + age;
    }

    public static void main(String[] args) {
        Person person = new Person(null, 32);
        System.out.println(person.toString());
        System.out.println(person.getName());
        //System.out.println(person.getName().toUpperCase(Locale.ROOT));
        // exception raised: toUpperCase method does not work with null
    }
}
