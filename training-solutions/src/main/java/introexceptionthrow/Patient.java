package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (yearOfBirth < 1900){
            throw new IllegalArgumentException("Életkor nem megfelelő.");
        }
        if (name.length() == 0){
            throw new IllegalArgumentException("Név megadása kötelező.");
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient patient_A = new Patient("Frigyes", "333222444555", 1901);
        //Patient patient_B = new Patient("", "333222444555", 1901);
        Patient patient_C = new Patient("Frigyes", "333222444555", 1899);
    }
}
