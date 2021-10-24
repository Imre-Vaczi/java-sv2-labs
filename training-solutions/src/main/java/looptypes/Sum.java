package looptypes;

public class Sum {
    public void printSums(int[] numbers){
        for (int index = 0; index < numbers.length-1; index++){
            System.out.print(numbers[index] + numbers[index+1] + " ");
        }
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.printSums(new int[]{2, 6, 3, 5, 7, 9});
    }
}
