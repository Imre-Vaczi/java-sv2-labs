package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }
    public String getDeletedFlights(){
        StringBuilder stringBuilder = new StringBuilder("Törölt járatok:");
        for (Flight plane: flights){
            if (plane.getStatus() == Status.DELETED){
                stringBuilder.append("\n");
                stringBuilder.append(plane.getFlightNumber());
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Flight flightOne = new Flight("sdsélakdf", Status.ACTIVE);
        Flight flightTwo = new Flight("sasteriljdkvf", Status.ACTIVE);
        Flight flighThree = new Flight("s566egff", Status.DELETED);
        Flight flightFour = new Flight("6w565kdf", Status.DELETED);
        Airport airport = new Airport();
        airport.addFlight(flightOne);
        airport.addFlight(flightTwo);
        airport.addFlight(flighThree);
        airport.addFlight(flightFour);
        System.out.println(airport.getDeletedFlights());

    }
}
