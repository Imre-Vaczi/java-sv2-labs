package exit;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String input = "";
/*        while (!input.equals("x")){
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. \nKilépés: x billentyű megnyomásával");
            input = scanner.nextLine();
            }*/
        do {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. \nKilépés: x billentyű megnyomásával");
            input = scanner.nextLine();
        }while (!input.equals("x"));
    }
}
