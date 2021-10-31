package stringconcat.employee;

public class Employee {
    private String name;
    private String occupation;
    private int salary;

    public String toString(){
        return this.name +" - "+ this.occupation +" - "+ this.salary + " Ft";
    }

    public Employee(String name, String occupation, int salary) {
        this.name = name;
        this.occupation = occupation;
        this.salary = salary;
    }
}
