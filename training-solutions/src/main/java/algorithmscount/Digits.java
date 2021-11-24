package algorithmscount;

public class Digits {
    public int getCountOfNumbers() {
        int countValue = 0;
        for (int i = 10; i < 100; i++) {
            if (isDifferenceFive(i)) {
                countValue++;
            }
        }
        return countValue;
    }

    private boolean isDifferenceFive(int i) {
        return (Math.abs(Integer.toString(i).charAt(0) - Integer.toString(i).charAt(1)) == 5);
    }
}
