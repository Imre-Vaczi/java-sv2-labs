package collectionsset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {

    @Test
    void testDrawWinnersSuccess() {
        QuestionGame questionGame;
        List<RightAnswer> bingo = new LinkedList<>();
        bingo.add(new RightAnswer("aa"));
        bingo.add(new RightAnswer("bb"));
        bingo.add(new RightAnswer("cc"));
        bingo.add(new RightAnswer("aa"));
        bingo.add(new RightAnswer("dd"));
        bingo.add(new RightAnswer("ee"));
        bingo.add(new RightAnswer("ff"));
        bingo.add(new RightAnswer("gg"));
        bingo.add(new RightAnswer("hh"));
        questionGame = new QuestionGame(bingo);

        Set<String> result = questionGame.drawWinners();

        assertEquals(5, result.size());
    }

    @Test
    void testDrawWinnersFail() {
        QuestionGame questionGame;
        List<RightAnswer> bingo = new LinkedList<>();

        bingo.add(new RightAnswer("aa"));
        bingo.add(new RightAnswer("hh"));
        questionGame = new QuestionGame(bingo);

        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->  questionGame.drawWinners());
        assertEquals("No more participant.", exception.getMessage());
    }

}