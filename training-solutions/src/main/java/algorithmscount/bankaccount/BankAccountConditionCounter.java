package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> accounts, int threshold) {
        int countValue = 0;
        for (BankAccount account : accounts) {
            if (account.getBalance() > threshold) {
                countValue++;
            }
        }
        return countValue;
    }
}
