package inheritanceattributes.book;

public class ShippedBook extends Book{

    private int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces) {
        return pieces * this.price + this.shippingCost;
    }

    public String toString() {
        return this.getTitle() + ": " + this.price + " Ft, shipping cost: " + this.shippingCost + " Ft";
    }

    public int getShippingCost() {
        return shippingCost;
    }
}
