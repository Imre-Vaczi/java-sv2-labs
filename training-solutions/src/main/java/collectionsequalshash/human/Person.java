package collectionsequalshash.human;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String taj;

    public Person(String name, int age, String taj) {
        this.name = name;
        this.age = age;
        this.taj = taj;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Person perObj = (Person) obj;
        return perObj.getTaj().equals(this.taj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taj);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTaj() {
        return taj;
    }

    public static void main(String[] args) {
        Person personA = new Person("A", 15, "000");
        Person personB = new Person("B", 16, "000");
        System.out.println(personA.equals(personB));
        System.out.println(personA.hashCode());
        System.out.println(personB.hashCode());
    }
}
