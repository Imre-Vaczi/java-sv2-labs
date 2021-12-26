package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();



    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Accounts can not be null");
        }
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        if (lookUpByAccountNumber(accountNumber) == null) {
            throw new InvalidAccountNumberBankOperationException("Account does not exist");
        }
        lookUpByAccountNumber(accountNumber).subtract(amount);
    }

    public void depositToAccount(String accountNumber, double amount) {
        if (lookUpByAccountNumber(accountNumber) == null) {
            throw new InvalidAccountNumberBankOperationException("Account does not exist");
        }
        lookUpByAccountNumber(accountNumber).deposit(amount);
    }

    private Account lookUpByAccountNumber(String accountNumber) {
        Account result = null;
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                result = account;
            }
        }
        return result;
    }
}
