package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testGenerating() {
        Player player = new Player();
        player.setName("aaa bbb");
        player.setMail("ggg@ttt");

        assertEquals("aaa bbb", player.getName());
        assertEquals("ggg@ttt", player.getMail());
    }

}