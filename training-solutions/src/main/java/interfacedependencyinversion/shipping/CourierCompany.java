package interfacedependencyinversion.shipping;

public class CourierCompany {

    public static void main(String[] args) {

        Box small = new SmallBox();
        System.out.println(small.getPrice());
        System.out.println(small.getSize());

        Box medium = new MediumBox();
        System.out.println(medium.getPrice());
        System.out.println(medium.getSize());

        Box large = new LargeBox();
        System.out.println(large.getPrice());
        System.out.println(large.getSize());

        Box extra = new ExtraLargeBox();
        System.out.println(large.getPrice());
        System.out.println(large.getSize());

    }
}
