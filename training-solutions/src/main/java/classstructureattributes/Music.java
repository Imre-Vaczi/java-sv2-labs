package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter on of your favorite band: ");
        song.band = scanner.nextLine();
        System.out.println("Please enter the title of the song: ");
        song.title = scanner.nextLine();
        System.out.println("Please enter the length of the song in minutes: ");
        song.length = scanner.nextInt();

        System.out.println(song.band+" - "+song.title+" ("+song.length+" perc)");
    }
}
