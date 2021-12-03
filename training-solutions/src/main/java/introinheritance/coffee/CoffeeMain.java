package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        coffee.setName("standard");
        coffee.setPrice(100);
        System.out.println(coffee.toString());
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("freddo");
        cappuccino.setPrice(120);
        System.out.println(cappuccino.toString());
        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());
    }
}
