package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    void testTransactionCounterMethods() {
        List<Transaction> listToTest = new ArrayList<>();
        listToTest.add(new Transaction("1111", TransactionType.CREDIT, 1000));
        listToTest.add(new Transaction("1112", TransactionType.CREDIT, 2000));
        listToTest.add(new Transaction("1113", TransactionType.CREDIT, 3000));
        listToTest.add(new Transaction("1114", TransactionType.CREDIT, 4000));
        TransactionCounter transactionCounter = new TransactionCounter();

        assertEquals(2, transactionCounter.countEntryLessThan(listToTest, 2400));
        assertEquals(4, transactionCounter.countEntryLessThan(listToTest, 8400));
        assertEquals(0, transactionCounter.countEntryLessThan(listToTest, 10));
    }
}