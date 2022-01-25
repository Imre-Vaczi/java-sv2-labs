package collectionsmap;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    ClassTrip classTrip = new ClassTrip();

    @Test
    void testLoadInpayments() {
        classTrip.loadInPayments(Paths.get("src/test/resources/inpayments.txt"));

        assertEquals(3, classTrip.getPaymentTracker().entrySet().size());
        assertEquals(true, classTrip.getPaymentTracker().containsKey("Kiss József"));
        assertEquals(false, classTrip.getPaymentTracker().containsValue(20000));
        assertEquals(5000, classTrip.getPaymentTracker().get("Nagy Béla"));
/*        assertEquals(3, classTrip.loadInPayments().entrySet().size());
        assertEquals(true, classTrip.loadInPayments().containsKey("Kiss József"));
        assertEquals(false, classTrip.loadInPayments().containsValue(20000));
        assertEquals(5000, classTrip.loadInPayments().get("Nagy Béla"));*/
    }

    @Test
    void testLoadInpaymentsFromNonExistingFile() {
        Exception ex = assertThrows(IllegalStateException.class, () -> classTrip.loadInPayments(Paths.get("xyz.txt")));
        assertEquals("File can not be read.", ex.getMessage());
    }

}