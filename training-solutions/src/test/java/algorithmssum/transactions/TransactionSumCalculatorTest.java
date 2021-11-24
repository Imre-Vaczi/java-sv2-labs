package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {

    @Test
    void testTransactionSumCalculatorTestMethods() {
        List<Transaction> transactionsToTest = new ArrayList<>();
        transactionsToTest.add(new Transaction("111", TransactionOperation.CREDIT, 100));
        transactionsToTest.add(new Transaction("111", TransactionOperation.CREDIT, 100));
        transactionsToTest.add(new Transaction("111", TransactionOperation.CREDIT, -50));
        transactionsToTest.add(new Transaction("122", TransactionOperation.DEBIT, 100));

        TransactionSumCalculator transactionSumCalculator = new TransactionSumCalculator();
        assertEquals(150, transactionSumCalculator.sumAmountOfCreditEntries(transactionsToTest));
    }
}