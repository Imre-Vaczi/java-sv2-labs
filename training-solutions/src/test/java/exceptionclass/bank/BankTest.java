package exceptionclass.bank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void testGeneratingValid() {
        Bank bank = new Bank(Arrays.asList(
                new Account("111-222", 1000),
                new Account("111-333", 1500),
                new Account("111-444", 3000)
        ));
        assertEquals(3, bank.getAccounts().size());
    }

    @Test
    void testGeneratingInvalidNull() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->new Bank(null));

        assertEquals("Accounts can not be null", exception.getMessage());
    }

    @Test
    void testWithdraw() {
        Bank bank = new Bank(Arrays.asList(
                new Account("111-222", 1000),
                new Account("111-333", 1500),
                new Account("111-444", 3000)
        ));
        bank.withdrawFromAccount("111-333", 300);
        assertEquals(1200, bank.getAccounts().get(1).getBalance());
    }

    @Test
    void testWithdrawInvalid() {
        Bank bank = new Bank(Arrays.asList(new Account("111-222", 1000)));
        Exception exception = assertThrows(InvalidAccountNumberBankOperationException.class,
                ()-> bank.withdrawFromAccount("111-333", 300));
        assertEquals("Account does not exist", exception.getMessage());
    }

    @Test
    void testDepositValid() {
        Bank bank = new Bank(Arrays.asList(
                new Account("111-222", 1000),
                new Account("111-333", 1500),
                new Account("111-444", 3000)
        ));
        bank.depositToAccount("111-333", 300);
        assertEquals(1800, bank.getAccounts().get(1).getBalance());
    }

    @Test
    void testDepositInvalid() {
        Bank bank = new Bank(Arrays.asList(new Account("111-222", 1000)));
        Exception exception = assertThrows(InvalidAccountNumberBankOperationException.class,
                ()-> bank.depositToAccount("111-333", 300));
        assertEquals("Account does not exist", exception.getMessage());
    }
}