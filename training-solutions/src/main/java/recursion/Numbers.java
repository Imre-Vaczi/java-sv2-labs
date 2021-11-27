package recursion;

import java.util.Arrays;

public class Numbers {
    public int getSum(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        if (numbers.length > 1) {
            int[] newNumbers = Arrays.copyOfRange(numbers, 1, numbers.length);
            int result = numbers[0] + getSum(newNumbers);
            return result;
        } else {
            return numbers[0];
        }
    }
}
