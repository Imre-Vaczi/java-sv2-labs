package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void testIsPrime() {
        Prime prime = new Prime();
        assertTrue(prime.isPrime(2));
        assertTrue(prime.isPrime(3));
        assertTrue(prime.isPrime(5));
        assertTrue(prime.isPrime(7));
        assertTrue(prime.isPrime(11));
        assertTrue(prime.isPrime(7883));

        assertFalse(prime.isPrime(-1));
        assertFalse(prime.isPrime(0));
        assertFalse(prime.isPrime(1));
        assertFalse(prime.isPrime(4));
        assertFalse(prime.isPrime(9));
    }
}