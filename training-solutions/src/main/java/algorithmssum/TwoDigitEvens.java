package algorithmssum;

public class TwoDigitEvens {
    public int getSum() {
        int finalSum = 0;
        for (int i = 10; i < 100; i++) {
            if ((i%2!=0) && (i%5!=0)) {
                finalSum += i;
            }
        }
        return finalSum;
    }
}
