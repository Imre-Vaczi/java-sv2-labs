package introexceptiontrace.numbers;

import java.util.Random;

public class RandomOperations {
    private Random random = new Random();

    public int[] getNumbers() {
        int lengthOfArray = random.nextInt(10) + 1;
        int[] numbers = new int[lengthOfArray];
        for (int i = 0; i <= lengthOfArray; i++) { // i should be smaller but not equal to the length of the array
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}
