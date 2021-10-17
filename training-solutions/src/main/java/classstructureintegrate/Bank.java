package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the owner: ");
        String owner = scanner.nextLine();
        System.out.println("Enter the account number: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter the opening balance: ");
        int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);

        System.out.println("Actual: ");
        bankAccount.getInfo();

        System.out.println("Enter the amount you wish to withdraw: ");
        bankAccount.withdraw(scanner.nextInt());

        System.out.println("Actual: ");
        bankAccount.getInfo();

        System.out.println("Enter the amount you wish to deposit: ");
        bankAccount.deposit(scanner.nextInt());

        System.out.println("Actual: ");
        bankAccount.getInfo();
    }
}
