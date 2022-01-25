package sorting;

import java.util.Arrays;
import java.util.Collections;


public class Income {

    private int[] annualIncome;

    public Income(int[] annualIncome) {
        this.annualIncome = annualIncome;
    }

    public int[] getAnnualIncome() {
        return annualIncome;
    }

    public int getHighestIncome() {
        Arrays.sort(annualIncome);
        return annualIncome[annualIncome.length-1];
    }
}
