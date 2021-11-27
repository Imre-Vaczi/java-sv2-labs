package algorithmsdecision;

import javax.print.attribute.standard.OrientationRequested;
import java.util.ArrayList;
import java.util.List;

public class Prime {

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2 | number == 3) {
            return true;
        }
        return checkRemainders(listingRemainders(number));
    }

    private List<Boolean> listingRemainders(int number) {
        List<Boolean> remainders = new ArrayList<>();
        for (int i = 2; i <= (number/2); i++) {
            remainders.add(number % i == 0);
        }
        return remainders;
    }

    private boolean checkRemainders(List<Boolean> listToCheck) {
        for (boolean b : listToCheck) {
            if (b) {
                return false;
            }
        }
        return true;
    }
}
