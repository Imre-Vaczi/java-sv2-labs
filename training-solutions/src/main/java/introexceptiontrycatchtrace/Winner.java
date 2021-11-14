package introexceptiontrycatchtrace;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Winner {
    private List<String> players = Arrays.asList("Anna", "Pál", "Virág", "Frigyes", "Eduárd", null);

    public String getWinner(){
        int winnerIndex = new Random().nextInt(players.size());
        return players.get(winnerIndex).toUpperCase(Locale.ROOT);
    }

}
