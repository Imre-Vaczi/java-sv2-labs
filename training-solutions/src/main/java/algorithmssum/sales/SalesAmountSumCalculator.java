package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<Salesperson> salespersons) {
        int resultSum = 0;
        for (Salesperson salesMember : salespersons) {
            resultSum += salesMember.getAmount();
        }
        return resultSum;
    }
}
