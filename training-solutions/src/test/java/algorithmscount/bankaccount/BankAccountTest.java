package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testGeneratingBankAccount() {
        BankAccount bankAccount = new BankAccount("Tony Montana", "100000200000300000", 1000);
        assertEquals("Tony Montana", bankAccount.getNameOfOwner());
        assertEquals("100000200000300000", bankAccount.getAccountNumber());
        assertEquals(1000, bankAccount.getBalance());
    }

}