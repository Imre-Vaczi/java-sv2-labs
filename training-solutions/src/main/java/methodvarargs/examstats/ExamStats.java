package methodvarargs.examstats;

public class ExamStats {

    public int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null ||results.length == 0) {
            throw new IllegalArgumentException("List of results can not be empty.");
        }

        if (limitInPercent == 0) {
            return results.length;
        }
        int countOfTopCases = 0;
        for (Integer i : results) {
            if ((100*i/maxPoints) > limitInPercent) {
                countOfTopCases++;
            }
        }
        return countOfTopCases;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("List of results can not be empty.");
        }
        if (limitInPercent == 0) {
            return false;
        }
        for (Integer i : results) {
            if ((100*i/maxPoints) < limitInPercent) {
                return true;
            }
        }
        return false;
    }
}
