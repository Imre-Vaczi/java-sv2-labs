package looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    public int[] changeToZero(int[] numbers){
        for (int index = numbers.length-1; index >= 0; index = index-3){
            numbers[index] = 0;
        }
        return numbers;
    }

    public static void main(String[] args) {
        EveryThird everyThird = new EveryThird();
        int[] numbers = everyThird.changeToZero(new int[]{2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9});
        System.out.println(Arrays.toString(numbers));
    }
}
