package numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number to check for 7: ");
        int input = scanner.nextInt();
        for (Integer i = 0; i <= input; i++){
            if (i % 7 != 0 & i.toString().contains("7")){
                break;
            }else if (i % 7 == 0){
                System.out.println("X");
            }else{
                System.out.println(i);
            }
        }
    }
}
