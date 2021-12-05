package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void testAmount() {
        Payable amount = new Amount();
        assertEquals(1234, amount.getPayableAmount(1234));
    }

    @Test
    void testCash() {
        Payable cash = new Cash();
        assertEquals(1235, cash.getPayableAmount(1234));
        assertEquals(1240, cash.getPayableAmount(1238));
        assertEquals(1230, cash.getPayableAmount(1231));
    }

    @Test
    void testBankAtm() {
        Payable bankAtm = new BankAtm();
        assertEquals(1000, bankAtm.getPayableAmount(999));
        assertEquals(1000, bankAtm.getPayableAmount(1));
        assertEquals(2000, bankAtm.getPayableAmount(1040));
        assertEquals(2000, bankAtm.getPayableAmount(1999));
    }

}