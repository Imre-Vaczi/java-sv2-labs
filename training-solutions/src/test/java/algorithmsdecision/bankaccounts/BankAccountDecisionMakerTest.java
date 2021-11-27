package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    BankAccountDecisionMaker badm = new BankAccountDecisionMaker();
    List<BankAccount> accountList = Arrays.asList(
            new BankAccount("a", "111", 1000),
            new BankAccount("b", "112", 600),
            new BankAccount("c", "113", 1100)
    );

    @Test
    void testContainsBalanceGreaterThan() {
        assertEquals(true, badm.containsBalanceGreaterThan(accountList, 800));
        assertEquals(false, badm.containsBalanceGreaterThan(accountList, 2000));
    }

}