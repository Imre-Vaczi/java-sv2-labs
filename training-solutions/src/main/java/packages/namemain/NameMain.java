package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        FirstName firstName = new FirstName("John");
        LastName lastName = new LastName("Doe");
        Prefix preFix = new Prefix("Mr.");

        System.out.println(preFix.getPre() + " " + firstName.getFirst() + " " + lastName.getLast());
    }
}
