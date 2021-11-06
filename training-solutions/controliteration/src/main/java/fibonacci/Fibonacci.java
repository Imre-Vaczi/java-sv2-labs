package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of subsequence for the Fib. seq. do you want to know?");
        int input = scanner.nextInt();
        List<Integer> result= new ArrayList<>();
        result.add(0);
        result.add(1);
        if (input == 0 || input == 1){
            System.out.println(result.subList(0,input));
        }else{
            for (int i = 2; i <= input; i++){
                result.add(result.get(i-2) + result.get(i-1));
            }
            System.out.println(result.subList(0, input));
        }
    }
}
