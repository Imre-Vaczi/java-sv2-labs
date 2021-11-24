package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void testTransactionMethods() {
        Transaction transaction = new Transaction("000000111111122222233333", TransactionOperation.CREDIT, 1000);
        assertEquals(1000, transaction.getAmount());
        assertEquals(TransactionOperation.CREDIT, transaction.getTransactionOperation());
        assertEquals("000000111111122222233333", transaction.getAccountNumber());
    }

}