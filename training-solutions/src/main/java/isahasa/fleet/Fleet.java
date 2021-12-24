package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;

    public void loadShip(int passengers, int cargoWeight) {
        this.waitingPeople = passengers;
        this.waitingCargo = cargoWeight;

        for (Ship ship : ships) {
            if (ship instanceof CanCarryGoods) {
                int tempCargo = ((CanCarryGoods) ship).loadCargo(waitingCargo);
                waitingCargo = tempCargo;
            }

            if (ship instanceof CanCarryPassengers) {
                int tempPassenger = ((CanCarryPassengers) ship).loadPassenger(waitingPeople);
                waitingPeople = tempPassenger;
            }
        }
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
