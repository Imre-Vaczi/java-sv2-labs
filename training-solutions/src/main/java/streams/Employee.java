package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {

        List<Employee> workers = Arrays.asList(
                new Employee("D", 1980),
                new Employee("G", 1990),
                new Employee("H", 1986)
        );

        //Összegezd az alkalmazottak születési éveit!
        int totalYOB = workers
                .stream()
                .map((Employee e) -> e.yearOfBirth)
                .mapToInt(e -> e)
                .sum();
        System.out.println(totalYOB);

        //Összegezd az alkalmazottak életkorát!
        int totalAge = workers
                .stream()
                .map((Employee e) -> LocalDate.now().getYear() - e.yearOfBirth)
                .mapToInt(e -> e)
                .sum();
        System.out.println(totalAge);

        //Add vissza streammel, hány alkalmazott van a listában!
        int numOfWorkers = (int) workers
                .stream()
/*                .map((Employee e) -> e.yearOfBirth)
                .mapToInt(e -> e)*/
                .count();
        System.out.println(numOfWorkers);

        //Add vissza, hány alkalmazott született 1990-nél korábban!
        int bornBefore = (int) workers
                .stream()
                .filter((Employee e) -> e.yearOfBirth < 1990)
                .map((Employee e) -> e.yearOfBirth)
                .mapToInt(e -> e)
                .count();
        System.out.println(bornBefore);

        //Add vissza a legkorábban született alkalmazott születési évét!
/*        Optional<Integer> bornEarliest = workers
                .stream()
                .map((Employee e) -> e.yearOfBirth)
                .min(Integer::compare);
        System.out.println(bornEarliest);*/
        int bornEarliest = workers
                .stream()
                .mapToInt(e -> e.getYearOfBirth())
                .min()
                .orElseThrow(() -> new IllegalArgumentException("no min value"));

        //Add vissza a legkorábban született alkalmazott nevét! (Itt szükség lesz a findFirst() záróműveletre.)
        String nameBornFirst = workers
                .stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return Integer.valueOf(o1.yearOfBirth).compareTo(o2.yearOfBirth);
                    }
                })
                .map(e -> e.getName())
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("no value to be used"));

        //Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e?
        /*List<Boolean> checkYOB = workers
                .stream()
                .map((Employee e) -> e.yearOfBirth < 1980)
                .collect(Collectors.toList());
        Boolean allBornBefore = !checkYOB.contains(Boolean.FALSE);
        System.out.println(allBornBefore);*/
        Boolean allBornBefore = workers
                .stream()
                .allMatch(e -> e.yearOfBirth < 1980);
        System.out.println(allBornBefore);

        //Add vissza egy listában az összes, 1990-nél korábban született alkalmazottat!
        List<Employee> workersBornBefore = workers
                .stream()
                .filter((Employee e) -> e.yearOfBirth < 1990)
                .collect(Collectors.toList());
        System.out.println(workersBornBefore);

        //Add vissza egy listában az összes alkalmazott nevét!
        List<String> allNames = workers
                .stream()
                .map((Employee e) -> e.getName())
                .collect(Collectors.toList());
        System.out.println(allNames);

        //Az előző két feladat kombinációja: Add vissza egy listában az összes, 1990-nél korábban született alkalmazott nevét!
        List<String> allNamesBornBefore = workers
                .stream()
                .filter((Employee e) -> e.yearOfBirth < 1990)
                .map((Employee e) -> e.name)
                .collect(Collectors.toList());
        System.out.println(allNamesBornBefore);
    }
}
