package linebreak;

public class Car {
    public String getBrandAndTypeInSeparateLines(String brand, String type){
        return brand + "\n" + type;
    }

    public static void main(String[] args) {
        String brand = "Citroen";
        String type = "DS";

        Car car = new Car();

        System.out.println(car.getBrandAndTypeInSeparateLines(brand,type));
    }
}
