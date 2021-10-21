package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.subtractTenIfGreaterThanTen(11));
        System.out.println(introControl.subtractTenIfGreaterThanTen(0));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));
        System.out.println(introControl.calculateBonus(10000));
        System.out.println(introControl.calculateBonus(11000000));
        System.out.println(introControl.calculateConsumption(30000, 90000));
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.greetingToJoe("Joe"));
        introControl.printNumbers(4);
        //stb. stb.
    }
}
