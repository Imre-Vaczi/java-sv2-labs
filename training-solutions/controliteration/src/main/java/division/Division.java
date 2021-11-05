package division;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int dividend = scanner.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int factor = scanner.nextInt();
        List<Integer> resultList = new ArrayList<>();

        int i = factor;
        while (i < dividend){
            if (i % factor == 0){
                resultList.add(i);

            }i++;
        }

        /*for (int i = factor; i < dividend; i++){
            if (i % factor == 0){
                resultList.add(i);
            }
        }*/
        System.out.println(resultList.toString());

    }

}
