package interfacedependencyinversion.shipping;

public enum Size {

    S(1000), M(2000), L(3000), XL(5000);

    private int price;

    Size(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
