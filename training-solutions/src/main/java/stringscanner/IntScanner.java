package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints){
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder sb = new StringBuilder();

        while (scanner.hasNextInt()){
            int temp = scanner.nextInt();
            if (temp >= 100){
                sb.append(temp + ",");
            }
        }
        if (sb.toString().length() == 0){
            return sb.toString();
        }else{
            return sb.toString().substring(0,sb.toString().length()-1);
        }
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
    }
}
