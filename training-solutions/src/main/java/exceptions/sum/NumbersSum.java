package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter can not be null");
        }
        return sum(numbers);
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter can not be null");
        }
        int result = 0;
        try {
            result = sum(convertStringToInt(numbers));
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Can not be converted to number", e);
        }
        return result;
    }

    private int sum(int[] numbers) {
        int result = 0;
        for (Integer i : numbers) {
            result += i;
        }
        return result;
    }

    private int[] convertStringToInt(String[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = Integer.parseInt(numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        NumbersSum ns = new NumbersSum();
        System.out.println(ns.getSum(new int[] {1,2,3}));
        System.out.println(ns.getSum(new String[] {"1","2","3"}));
    }
}
