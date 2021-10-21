package introcontrol;

public class IntroControl {
    public int subtractTenIfGreaterThanTen(int number){
        if (number >= 10){
            return number;
        } else {
            return number - 10;
        }
    }

    public String describeNumber(int number){
        if (number == 0){
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingToJoe(String name){
        if (name.equals("Joe")){
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public double calculateBonus(int sale){
        if (sale >= 1000000){
            return sale * 0.1;
        } else{
            return 0;
        }
    }

    public int calculateConsumption(int prev, int next){
        if (next < prev){
            return (next + 9999) - prev;
        } else {
            return next - prev;
        }
    }

    public void printNumbers(int max){
        for (int i = 0; i < max +1; i++){
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max){
        for (int j = min; j < max +1; j++){
            System.out.println(j);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b){
        if (a > b){
            for (int k = b; k < a; k++){
                System.out.println(k);
            }} else{
                for (int k = a; k < b; k++){
                    System.out.println(k);

            }
        }
    }

    public void printOddNumbers(int max){
        for (int i = 0; (i < max+1) & (i%2 != 0) ; i++){
            System.out.println(i);
        }
    }


}
