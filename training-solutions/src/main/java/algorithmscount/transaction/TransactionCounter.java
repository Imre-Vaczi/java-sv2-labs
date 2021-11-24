package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> listOfTransaction, int threshold) {
        int valueCount = 0;
        for (Transaction transaction : listOfTransaction) {
            if (transaction.getAmount() < threshold) {
                valueCount++;
            }
        }
        return valueCount;
    }
}
