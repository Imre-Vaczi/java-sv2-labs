package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Agárd", "4444", "Levél utca", 76);
        Details details = new Details("Nyaraló", address, 100,190);
        RealEstate realEstate = new RealEstate("Nyaraló eladó", 20000000, details);

        System.out.println(realEstate.toString());
    }
}
