package finalmodifier;

public class TaxCalculator {
    public static final double TAX = 27.0;

    double tax(double price){
        return price * (TAX / 100);
    }

    double priceWithTax(double price){
        return new TaxCalculator().tax(price) + price;
    }

    public static void main(String[] args) {
        System.out.println(new TaxCalculator().tax(10));
        System.out.println(new TaxCalculator().priceWithTax(10));
    }
}
