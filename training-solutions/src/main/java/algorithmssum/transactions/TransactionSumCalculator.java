package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sumOfCredits = 0;
        for (Transaction movement : transactions) {
            if (movement.getTransactionOperation().equals(TransactionOperation.CREDIT)) {
                sumOfCredits += movement.getAmount();
            }
        }
        return sumOfCredits;
    }

    public int sumAmountOfDebitEntries(List<Transaction> transactions) {
        int sumOfDebits = 0;
        for (Transaction movement : transactions) {
            if (movement.getTransactionOperation().equals(TransactionOperation.DEBIT)) {
                sumOfDebits += movement.getAmount();
            }
        }
        return sumOfDebits;
    }
}
