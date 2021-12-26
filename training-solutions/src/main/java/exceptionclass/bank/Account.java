package exceptionclass.bank;

public class Account {

    private String accountNumber;
    private double balance;
    private double maxSubtract = 100000;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number can not be null");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountBankOperationException("Invalid amount");
        }
        this.balance += amount;
    }

    public void subtract(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountBankOperationException("Invalid amount");
        }
        if (amount > maxSubtract) {
            throw new InvalidAmountBankOperationException("Above withdraw threshold");
        }
        if (this.balance - amount < 0) {
            throw new LowBalanceBankOperationException("Rejected due to low balance");
        }
        this.balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        this.maxSubtract = maxSubtract;
    }
}
