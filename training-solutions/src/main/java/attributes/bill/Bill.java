package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem = new BillItem("wine", 1200,1, 20);
        System.out.println(billItem.calculateTotalPrice());
    }
}
