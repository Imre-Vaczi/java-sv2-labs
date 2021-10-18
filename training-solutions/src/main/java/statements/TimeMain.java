package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.println("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.println("Enter seconds");
        int seconds = scanner.nextInt();

        Time time = new Time(hours, minutes, seconds);

        System.out.println("Enter hours again: ");
        int altHours = scanner.nextInt();
        System.out.println("Enter minutes again: ");
        int altMinutes = scanner.nextInt();
        System.out.println("Enter seconds again");
        int altSeconds = scanner.nextInt();

        Time altTime = new Time(altHours, altMinutes, altSeconds);

        System.out.println("Az első időpont " + time.toString() + " = " + time.getInMinutes() + " perc");
        System.out.println("A második időpont " + altTime.toString() + " = " + altTime.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + altTime.earlierThan(time));


    }
}
