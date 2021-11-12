package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office = new Office();

    public void printMenu(){
        System.out.println("\n1. Tárgyaló rögzítése\n" +
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
        System.out.println("\nKérem válasszon menüpontot!");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input) {
            case 1:
                caseOne();
                break;
            case 2:
                caseTwo();
                break;
            case 3:
                caseThree();
                break;
            case 4:
                caseFour();
                break;
            case 5:
                caseFive();
                break;
            case 6:
                caseSix();
                break;
            case 7:
                caseSeven();
                break;
            case 8:
                caseEight();
                break;
            case 9:
                break;
            default:
                runMenu();
        }
    }

    private void caseOne(){
        readOffice();
        runMenu();
    }
    private void caseTwo(){
        System.out.println(office.printNames());
        runMenu();
    }
    private void caseThree(){
        System.out.println(office.printNamesReverse());
        runMenu();
    }
    private void caseFour(){
        System.out.println(office.printEvenNames());
        runMenu();
    }
    private void caseFive(){
        System.out.println(office.printAreas());
        runMenu();
    }
    private void caseSix(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a keresendő tárgyaló nevét!");
        String nameSearch = scanner.nextLine();
        System.out.println(office.printMeetingRoomsWithName(nameSearch));
        runMenu();
    }
    private void caseSeven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a keresendő tárgyaló nevének töredékét!");
        String namePart = scanner.nextLine();
        System.out.println(office.printMeetingRoomsContain(namePart));
        runMenu();
    }
    private void caseEight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a kereséshez a terület alsó korlátját!");
        int areaInp = scanner.nextInt();
        scanner.nextLine();
        System.out.println(office.printAreasLargerThan(areaInp));
        runMenu();
    }


    public static void main(String[] args) {
        MeetingRoomController mrc = new MeetingRoomController();
        mrc.runMenu();
    }
}