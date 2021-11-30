package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void testGenerating() {
        Team team = new Team();

        assertEquals(null, team.getPlayerOne());
        assertEquals(null, team.getPlayerTwo());
    }

    @Test
    void testSetPlayerTwo() {
        Team team = new Team();
        team.setPlayerTwo(new Player());
        team.getPlayerTwo().setName("aaa");

        assertEquals("aaa", team.getPlayerTwo().getName());
    }

    @Test
    void testSetPlayerOne() {
        Team team = new Team();
        team.setPlayerOne(new Player());
        team.getPlayerOne().setMail("aaa@ggg");

        assertEquals("aaa@ggg", team.getPlayerOne().getMail());
    }
}