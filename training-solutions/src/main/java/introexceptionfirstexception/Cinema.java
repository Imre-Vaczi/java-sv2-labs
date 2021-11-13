package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    String name;
    String title;
    int numOfTickets;
    int row;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Kérem adja meg a nevét!");
        String name = scanner.nextLine();
        System.out.println("Kérem adja meg a megtekintendő film címét!");
        String title = scanner.nextLine();
        System.out.println("kérem adja meg a megvásárolandó jegyek számát!");
        int numOfTickets = scanner.nextInt();
        System.out.println("Kérem adja meg melyik sorba szeretne szeretne helyet foglalni!");
        int row = scanner.nextInt();

        stringBuilder.append("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\nVásárló neve: " + name);
        stringBuilder.append("\nFilm címe: " + title + "\nLefoglalt helyek: ");
        for (int i = 0; i < numOfTickets; i++){
            if (i == 0){
                stringBuilder.append(row + ". sor " + (i+1) + ". szék");
            }else{
                stringBuilder.append(", " + row + ". sor " + (i+1) + ". szék");
            }
        }
        stringBuilder.append("\nJó szórakozást!");
        System.out.println(stringBuilder.toString());
    }
}
