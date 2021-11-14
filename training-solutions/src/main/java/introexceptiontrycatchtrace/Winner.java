package introexceptiontrycatchtrace;

import java.util.*;

public class Winner {
    //private List<String> players = Arrays.asList("Anna", "Pál", "Virág", "Frigyes", "Eduárd", null);
    private List<String> players = new ArrayList<>(Arrays.asList("Sára", "Magdolna", "Frigyes", "Eduárd", null));
    public String getWinner(){
        int winnerIndex = new Random().nextInt(players.size());
        return players.get(winnerIndex).toUpperCase(Locale.ROOT);
    }

}
