package statements;
import java.util.Scanner;
public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Befektetés összege: ");
        int fund = scanner.nextInt();
        System.out.println("Kamatláb: ");
        int interestRate = scanner.nextInt();
        System.out.println("Nap: ");
        int days = scanner.nextInt();

        Investment investment = new Investment(fund, interestRate);

        System.out.println("Befektetés összege: ");
        System.out.println(investment.getFund());
        System.out.println("Kamatláb: ");
        System.out.println(investment.getInterestRate());
        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam " + days + " napra: " + investment.getYield(days));
        System.out.println("Kivett összeg " + days + " nap után: " + investment.close(days));

    }
}
