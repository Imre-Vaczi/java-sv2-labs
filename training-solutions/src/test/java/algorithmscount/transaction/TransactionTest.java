package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void testTransactionGeneration() {
        Transaction transaction = new Transaction("33333", TransactionType.CREDIT, 20000);
        assertEquals("33333", transaction.getAccountNumber());
        assertEquals(TransactionType.CREDIT, transaction.getTransactionType());
        assertEquals(20000, transaction.getAmount());
    }

}