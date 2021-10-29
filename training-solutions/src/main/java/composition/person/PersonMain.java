package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Magdalene", "3467");
        System.out.println(person.personToString());
        person.moveTo(new Address("Rhodesia", "Salisbury", "Jacaranda st 30", "1278"));
        System.out.println(person.getAddress());
        person.correctData("Magdalena", "3467");
        System.out.println(person.personToString());
        person.moveTo(new Address("Rhodesia", "Salisbury", "Chinamano av 42", "1558"));
        System.out.println(person.getAddress().getCountry());
    }
}
