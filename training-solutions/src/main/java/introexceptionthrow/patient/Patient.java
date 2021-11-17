package introexceptionthrow.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name.equals("") || name.equals(null)){
            throw new IllegalArgumentException("A név nem lehet üres");
        }
        if (yearOfBirth <= 1900) {
            throw new IllegalArgumentException("Születési év 1900 utáni lehet.");
        }

        if (!new SsnValidator().isValidSsn(socialSecurityNumber)){
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
        //példányosítás a selfcheck mappából másolva
        /*Patient firstPatient = new Patient("Kiss József", "123456788", 1954);

        System.out.println(firstPatient.getName());
        System.out.println(firstPatient.getSocialSecurityNumber());
        System.out.println(firstPatient.getYearOfBirth());*/
/*
        Patient secondPatient = new Patient("", "123456788", 1954);

        System.out.println(secondPatient.getName());
        System.out.println(secondPatient.getSocialSecurityNumber());
        System.out.println(secondPatient.getYearOfBirth());*/

/*        Patient thirdPatient = new Patient("Kiss József", "123456789", 1954);

        System.out.println(thirdPatient.getName());
        System.out.println(thirdPatient.getSocialSecurityNumber());
        System.out.println(thirdPatient.getYearOfBirth());*/

        Patient fourthPatient = new Patient("Kiss József", "123456788", 1888);

        System.out.println(fourthPatient.getName());
        System.out.println(fourthPatient.getSocialSecurityNumber());
        System.out.println(fourthPatient.getYearOfBirth());
    }
}
