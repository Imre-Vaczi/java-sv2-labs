package stringbasic.university;

public class Person {
    private String name;
    private String mail;
    private String tajNumber;
    private String accountNumber;
    private String phoneNumber;

    public Person(String name, String mail, String tajNumber, String accountNumber, String phoneNumber) {
        this.name = name;
        this.mail = mail;
        this.tajNumber = tajNumber;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getTajNumber() {
        return tajNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTajNumber(String tajNumber) {
        this.tajNumber = tajNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
