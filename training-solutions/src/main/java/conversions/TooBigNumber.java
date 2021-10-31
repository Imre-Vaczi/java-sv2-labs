package conversions;
import java.math.BigDecimal;
public class TooBigNumber {
    public String getRightResult(int number){
        double threshold = 2_147_483_647;
        double result = threshold + number;
        return BigDecimal.valueOf(result).toPlainString();
    }

    public static void main(String[] args) {
        TooBigNumber tooBigNumber = new TooBigNumber();
        System.out.println(tooBigNumber.getRightResult(100));
    }
}
