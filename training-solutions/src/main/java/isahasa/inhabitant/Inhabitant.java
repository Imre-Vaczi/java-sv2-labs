package isahasa.inhabitant;

public class Inhabitant extends Person{

    private ParkingPlace parkingPlace;

    public Inhabitant(String name, ParkingPlace parkingPlace) {
        super(name);
        this.parkingPlace = parkingPlace;
    }

    public ParkingPlace getParkingPlace() {
        return parkingPlace;
    }

    public void changeParkingPlace(int newParkingPlace) {
        this.parkingPlace.setNumber(newParkingPlace);
    }
}
