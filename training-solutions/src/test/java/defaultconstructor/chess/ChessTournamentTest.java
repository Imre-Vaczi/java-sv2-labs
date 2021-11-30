package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {

    @Test
    void testGenerating() {
        ChessTournament chessTournament = new ChessTournament();
        assertEquals(3, chessTournament.getTeams().size());
    }

    @Test
    void testAddPlayersToTeams() {
        Player pOne = new Player();
        pOne.setName("f");
        pOne.setMail("fff@fff");
        Player pTwo = new Player();
        pTwo.setName("g");
        pTwo.setMail("ggg@ggg");
        Player pThree = new Player();
        pThree.setName("z");
        pThree.setMail("zzz@zzz");

        List<Player> players = Arrays.asList(
                pOne,
                pTwo,
                pThree
        );

        ChessTournament chessTournament = new ChessTournament();
        chessTournament.addPlayersToTeams(players);

        assertEquals("f", chessTournament.getTeams().get(0).getPlayerOne().getName());
        assertEquals("g", chessTournament.getTeams().get(0).getPlayerTwo().getName());
    }

}