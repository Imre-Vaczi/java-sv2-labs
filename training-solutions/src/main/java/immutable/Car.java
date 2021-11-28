package immutable;

import java.time.LocalDate;
import java.util.Date;

public class Car {
    private final String brand;
    private final String type;
    private final int yearOfProduction;

    public Car(String brand, String type, int yearOfProduction) {
        if (brand == null || brand.trim().length()==0 || LocalDate.now().getYear() < yearOfProduction) {
            throw new IllegalArgumentException("Name can not be empty and/or year of production can not be in the future");
        }
        this.brand = brand;
        this.type = type;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
