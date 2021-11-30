package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessTournament {
    List<Team> teams;

    public ChessTournament() {
        this.teams = Arrays.asList(
                new Team(),
                new Team(),
                new Team()
        );
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        for (int i = 0; i < 3; i++) {
            try {
                teams.get(i).setPlayerOne(playersRegistrated.get(i));
            } catch (IndexOutOfBoundsException ioe) {
                teams.get(i).keepPlaceOne();
            }
            try {
                teams.get(i).setPlayerTwo(playersRegistrated.get(i+1));
            } catch (IndexOutOfBoundsException ioe) {
                teams.get(i).keepPlaceTwo();
            }
        }
    }
}
