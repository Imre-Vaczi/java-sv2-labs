package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testGenerateBankAccount() {
        BankAccount bankAccount = new BankAccount("x.y.", "1111111111-2222222222-333333333", 1000);
        assertEquals("x.y.", bankAccount.getNameOfOwner());
        assertEquals("1111111111-2222222222-333333333", bankAccount.getAccountNumber());
        assertEquals(1000, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        BankAccount bankAccount = new BankAccount("x.y.", "1111111111-2222222222-333333333", 1000);
        bankAccount.deposit(200);
        assertEquals(1200, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount bankAccount = new BankAccount("x.y.", "1111111111-2222222222-333333333", 1000);
        bankAccount.withdraw(400);
        assertEquals(600, bankAccount.getBalance());
    }

}