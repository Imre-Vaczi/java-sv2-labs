package collectionsiterator;

public class ChristmasPresent {

    private String presentDesc;
    private String toWhom;
    private int price;

    public ChristmasPresent(String presentDesc, String toWhom, int price) {
        this.presentDesc = presentDesc;
        this.toWhom = toWhom;
        this.price = price;
    }

    public String getPresentDesc() {
        return presentDesc;
    }

    public String getToWhom() {
        return toWhom;
    }

    public int getPrice() {
        return price;
    }
}
