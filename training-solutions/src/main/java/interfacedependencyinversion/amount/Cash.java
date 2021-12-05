package interfacedependencyinversion.amount;

public class Cash implements Payable{
    @Override
    public int getPayableAmount(int amount) {
        if ((amount%5) >= 3) {
            return amount += (5 - (amount%5));
        } else {
            return amount -= (amount%5);
        }
    }
}
