package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(1000.75, true);

        System.out.println("The distance is: " + distance.getDistanceInKm());
        System.out.println("Is it exact? " + distance.isExact());

        int newVar = (int) distance.getDistanceInKm();
        System.out.println("Appr. distance: " + newVar);



    }
}
