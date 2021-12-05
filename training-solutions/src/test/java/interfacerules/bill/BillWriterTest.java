package interfacerules.bill;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BillWriterTest {

    @Test
    void testGenerating() {
        Bill bill = new Bill();
        List<String> billText = bill.readBillItemsFromFile(Paths.get("src/test/resources/billitems.txt"));
        assertEquals(4, billText.size());
    }

    @Test
    void testWriteBillSimple() {
        Bill bill = new Bill();
        List<String> billText = bill.readBillItemsFromFile(Paths.get("src/test/resources/billitems.txt"));
        assertTrue(new SimpleBillWriter().writeBill(billText).startsWith("kenyér, 1 * 400 = 400 Ft\n" +
                "tej, 2 * 300 = 600 Ft"));
    }

    @Test
    void testWriteBillComplex() {
        Bill bill = new Bill();
        List<String> billText = bill.readBillItemsFromFile(Paths.get("src/test/resources/billitems.txt"));
        assertTrue(new ComplexBillWriter().writeBill(billText).startsWith("kenyér; darabszám: 1, egységár: 400, összesen: 400 Ft\n" +
                "tej; darabszám: 2, egységár: 300, összesen: 600 Ft"));
    }



}