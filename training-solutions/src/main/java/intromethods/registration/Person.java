package intromethods.registration;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private String email;

    public Person(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String toString(){
        String message = "Name: " + this.name + "\n" + "Date of birth: " + this.dateOfBirth + "\n" + "E-mail: " + this.email;
        return message;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }
}
