package stringbasic.university;

public class Student {
    private Person person;
    private String omNumber;
    private String neptunCode;
    private String passID;

    public Student(Person person, String omNumber, String neptunCode) {
        this.person = person;
        this.omNumber = omNumber;
        this.neptunCode = neptunCode;
    }

    public Person getPerson() {
        return person;
    }

    public String getOmNumber() {
        return omNumber;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setOmNumber(String omNumber) {
        this.omNumber = omNumber;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public void setPassID(String passID) {
        this.passID = passID;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public String getPassID() {
        return passID;
    }
}
