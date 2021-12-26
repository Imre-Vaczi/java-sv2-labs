package exceptionmulticatch.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerStatTest {

    @Test
    void testConvert() {
        AnswerStat as = new AnswerStat(new BinaryStringConverter());
        String inputData = "0101";
        boolean[] expected = new boolean[]{false, true, false, true};

        assertArrayEquals(expected, as.convert(inputData));
    }

    @Test
    void testAnswerTruePercent() {
        AnswerStat as = new AnswerStat(new BinaryStringConverter());
        String inputData = "0101";
        int expected = 50;

        assertEquals(expected, as.answerTruePercent(inputData));
    }

    @Test
    void testAnswerTruePercentInvalidNullPointer() {
        AnswerStat as = new AnswerStat(new BinaryStringConverter());
        String inputData = null;
        Exception exception = assertThrows(InvalidBinaryStringException.class,
                ()-> as.answerTruePercent(inputData));

        assertEquals("Error", exception.getMessage());
    }

    @Test
    void testAnswerTruePercentInvalidIllegalArgument() {
        AnswerStat as = new AnswerStat(new BinaryStringConverter());
        String inputData = "0123";
        Exception exception = assertThrows(InvalidBinaryStringException.class,
                ()-> as.answerTruePercent(inputData));

        assertEquals("Error", exception.getMessage());
    }

}