package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public int getBalance() {return balance;}
    public String getAccountNumber(){return accountNumber;}
    public String getOwner(){return owner;}
    public String getInfo(){return owner + " (" + accountNumber + "): " + balance + " Ft";}
    //Tóth Kálmán (10073217-12000098-67341590): 103400 Ft

    public void deposit(int depositedMoney){this.balance = this.balance + depositedMoney;}
    public void withdraw(int withdrawnMoney){this.balance = this.balance - withdrawnMoney;}
}
