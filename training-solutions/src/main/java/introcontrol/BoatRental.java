package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String boat_2 = "small";
        String boat_3 = "medium";
        String boat_5 = "big";
        int totalCap = 10;
        int groupNum;

        System.out.println("Number of people in the group: ");
        groupNum = scanner.nextInt();
        if (groupNum == 1){
            System.out.println(boat_2 + " boat is taken, 8 places left");
        }
        if (groupNum == 2){
            System.out.println(boat_2 + " is taken, 8 places left");
        }
        if  (groupNum == 3){
            System.out.println(boat_3 + " is taken, 7 places left");
        }
        if (groupNum == 4){
            System.out.println(boat_5 + " is taken, 5 places left");
        }
        if (groupNum == 5){
            System.out.println(boat_5 + " is taken, 5 places left");
        }
        if (groupNum == 6){
            System.out.println(boat_2 + " and " + boat_5 + " are taken, 3 places left");
        }
        if (groupNum == 7){
            System.out.println(boat_2 + " and " + boat_5 + " are taken, 3 places left");
        }
        if (groupNum == 8){
            System.out.println(boat_3 + " and " + boat_5 + " are taken, 2 places left");
        }
        if (groupNum == 9){
            System.out.println(boat_2 + ", " + boat_5 + " and " +boat_3+" are taken, no places left");
        }
        if (groupNum == 10){
            System.out.println(boat_2 + ", " + boat_5 + " and " +" are taken, no places left");
        }
        if (groupNum == 0){
            System.out.println("none of the boats are taken, 10 places left");
        }
        if (groupNum > 10) {
            System.out.println("All boats are taken, " + (groupNum-totalCap) + " places left");
        }

    }
}
