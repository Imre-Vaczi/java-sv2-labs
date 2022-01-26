package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BucketList {

    List<Destination> destinations = new ArrayList<>();

/*    public BucketList(List<Destination> destinations) {
        this.destinations = destinations;
    }*/

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword) {
        //Optional<Destination> selections = null;
        for (Destination dest : destinations) {
            if (dest.getDescription().contains(keyword)) {
                //selections = Optional.of(dest);
                return Optional.of(dest);
            }
        }
/*        selections = Optional.empty();
        return selections;*/
        return Optional.empty();
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm) {
        //Optional<Destination> selections = null;
        for (Destination dest : destinations) {
            if (dest.getKmFromHome() < maxKm) {
                //selections = Optional.of(dest);
                return Optional.of(dest);
            }
        }
/*        selections = Optional.empty();
        return selections;*/
        return Optional.empty();
    }
}
