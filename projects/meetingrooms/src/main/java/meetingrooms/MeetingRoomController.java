package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office = new Office();

    public void printMenu(){
        System.out.println("1. Tárgyaló rögzítése\n" +
                "2. Tárgyalók sorrendben\n" +
                "3. Tárgyalók visszafele sorrendben\n" +
                "4. Minden második tárgyaló\n" +
                "5. Területek\n" +
                "6. Keresés pontos név alapján\n" +
                "7. Keresés névtöredék alapján\n" +
                "8. Keresés terület alapján\n" +
                "9. Kilépés");
    }

    public void readOffice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg az új tárgyaló nevét, hosszát, majd szélességét!");
        String nameInp = scanner.nextLine();
        int lengthInp = scanner.nextInt();
        int widthInp = scanner.nextInt();
        scanner.nextLine();
        office.addMeetingRoom(new MeetingRoom(nameInp, lengthInp, widthInp));
    }

    public void runMenu() {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        boolean flag = true;
        while (flag) {
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    readOffice();
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println(office.printNames());
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println(office.printNamesReverse());
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println(office.printEvenNames());
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println(office.printAreas());
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Kérem adja meg a keresendő tárgyaló nevét!");
                    String nameSearch = scanner.nextLine();
                    System.out.println(office.printMeetingRoomsWithName(nameSearch));
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.println("Kérem adja meg a keresendő tárgyaló nevének töredékét!");
                    String namePart = scanner.nextLine();
                    System.out.println(office.printMeetingRoomsContain(namePart));
                    scanner.nextLine();
                    break;
                case 8:
                    System.out.println("Kérem adja meg a minimum tárgyalóméretet");
                    int areaInp = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(office.printAreasLargerThan(areaInp));
                    scanner.nextLine();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    runMenu();
            }
        }
    }

    public static void main(String[] args) {
        MeetingRoomController mrc = new MeetingRoomController();
        mrc.runMenu();
    }
}
