package collectionsqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> waitingForJabs = new LinkedList<>();
        for (Person somebody : people) {
            if (somebody.getAge() >= 18 & somebody.getAge() <= 56) {
                waitingForJabs.add(somebody.getAge());
            }
        }
        return waitingForJabs;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("a", 10));
        people.add(new Person("b", 20));
        people.add(new Person("c", 30));
        people.add(new Person("d", 40));
        people.add(new Person("e", 50));
        people.add(new Person("f", 60));
        people.add(new Person("g", 70));
        people.add(new Person("h", 80));

        Vaccination vaccination = new Vaccination();

        Queue<Integer> peopleToVac = vaccination.getVaccinationOrder(people);
        Integer firstOne = peopleToVac.poll();
        System.out.println(firstOne);
    }
}
