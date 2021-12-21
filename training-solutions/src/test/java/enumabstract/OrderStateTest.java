package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStateTest {

    @Test
    void testNew() {
        assertTrue(OrderState.NEW.canDelete());
    }

    @Test
    void testConfirmed() {
        assertTrue(OrderState.CONFIRMED.canDelete());
    }

    @Test
    void testPrepared() {
        assertTrue(OrderState.PREPARED.canDelete());
    }

    @Test
    void testOnboard() {
        assertFalse(OrderState.ONBOARD.canDelete());
    }

    @Test
    void testDelivered() {
        assertFalse(OrderState.DELIVERED.canDelete());
    }

    @Test
    void testDeleted() {
        assertFalse(OrderState.DELETED.canDelete());
    }

    @Test
    void testReturned() {
        assertFalse(OrderState.RETURNED.canDelete());
    }

}