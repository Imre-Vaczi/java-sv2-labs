package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String input) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(input);
        } catch (NullPointerException | IllegalArgumentException exception) {
            throw new InvalidBinaryStringException("Error", exception);
        }
    }

    public double answerTruePercent(String answers) {
        boolean[] temp = convert(answers);
        return calculateStatistics(temp);
    }

    private int calculateStatistics(boolean[] input) {
        int countOfElements = input.length;
        int countOfTrue = 0;
        for (Boolean value : input) {
            if (value) {
                countOfTrue++;
            }
        }
        return (int) ((countOfTrue / (countOfElements * 1.0)) * 100);
    }
}
