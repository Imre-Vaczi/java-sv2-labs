package exceptionclass.bank;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testGeneratingValid() {
        Account account = new Account("123-456", 10000000);

        assertFalse(account == null);
        assertEquals("123-456", account.getAccountNumber());
        assertEquals(10000000, account.getBalance());
    }

    @Test
    void testGeneratingInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new Account(null,10000));
        assertEquals("Account number can not be null", exception.getMessage());
    }

    @Test
    void testSubtractValid() {
        Account account = new Account("123-456", 200000);
        account.subtract(70000);
        assertEquals(130000, account.getBalance());
    }

    @Test
    void testSubtractInvalidAmount() {
        Account account = new Account("123-456", 200000);
        Exception exception = assertThrows(InvalidAmountBankOperationException.class,
                ()-> account.subtract(0));

        assertEquals("Invalid amount", exception.getMessage());
    }

    @Test
    void testSubtractInvalidThresholdIssue() {
        Account account = new Account("123-456", 200000);
        Exception exception = assertThrows(InvalidAmountBankOperationException.class,
                ()-> account.subtract(150000));

        assertEquals("Above withdraw threshold", exception.getMessage());
    }

    @Test
    void testSubtractInvalidLowBalanceIssue() {
        Account account = new Account("123-456", 100);
        Exception exception = assertThrows(LowBalanceBankOperationException.class,
                ()-> account.subtract(101));

        assertEquals("Rejected due to low balance", exception.getMessage());
    }

    @Test
    void testDepositValid() {
        Account account = new Account("123-456", 100);
        account.deposit(50);

        assertEquals(150, account.getBalance());
    }

    @Test
    void testDepositInvalid() {
        Account account = new Account("123-456", 100);
        Exception exception = assertThrows(InvalidAmountBankOperationException.class,
                ()-> account.deposit(0));
        assertEquals("Invalid amount", exception.getMessage());
    }
}