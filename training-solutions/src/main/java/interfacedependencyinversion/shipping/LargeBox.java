package interfacedependencyinversion.shipping;

public class LargeBox implements Box{

    @Override
    public Size getSize() {
        return Size.L;
    }

    @Override
    public int getPrice() {
        return Size.L.getPrice();
    }
}