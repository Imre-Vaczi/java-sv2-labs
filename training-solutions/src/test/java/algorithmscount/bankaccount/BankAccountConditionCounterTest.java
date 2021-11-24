package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {

    @Test
    void testBankAccountCounterMethod() {
        List<BankAccount> listOfAccounts = new ArrayList<>();
        listOfAccounts.add(new BankAccount("Eva", "111111", 20000));
        listOfAccounts.add(new BankAccount("Eve", "111112", 10000));
        listOfAccounts.add(new BankAccount("Eli", "111113", 30000));
        listOfAccounts.add(new BankAccount("Uno", "111114", 40000));

        BankAccountConditionCounter bankAccountConditionCounter = new BankAccountConditionCounter();

        assertEquals(2, bankAccountConditionCounter.countWithBalanceGreaterThan(listOfAccounts, 25000));
    }

}