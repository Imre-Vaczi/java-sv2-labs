package inheritancemethods.plane;

public class Plane {

    public static void main(String[] args) {

        Passenger passenger = new Passenger("X.Y.", 20000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("K.T.", 20000, 10);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("G.E", 20000, 10);

        System.out.println(passenger.getName());
        System.out.println(passenger.getPriceOfPlaneTicket());

        System.out.println(priorityPassenger.getName());
        System.out.println(priorityPassenger.getPercent());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());

        System.out.println(firstClassPassenger.getName());
        System.out.println(firstClassPassenger.getPercent());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
    }
}
