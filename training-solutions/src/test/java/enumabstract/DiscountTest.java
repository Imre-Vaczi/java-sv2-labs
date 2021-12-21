package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void testSpecialOffer() {
        double result = Discount.SPECIAL_OFFER.getAmountToPay(100, 2);
        assertEquals(160, result);
    }

    @Test
    void testBlackBelowOne() {
        double result = Discount.BLACK_FRIDAY_OFFER.getAmountToPay(100, 0);
        assertEquals(0, result);
    }

    @Test
    void testBlackOneTwo() {
        double result = Discount.BLACK_FRIDAY_OFFER.getAmountToPay(100, 2);
        assertEquals(150, result);
    }

    @Test
    void testBlackAboveTwo() {
        double result = Discount.BLACK_FRIDAY_OFFER.getAmountToPay(100, 3);
        assertEquals(200, result);
    }

}