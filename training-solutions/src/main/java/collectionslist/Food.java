package collectionslist;

import java.time.LocalDate;

public class Food {

    private String itemName;
    private LocalDate expiryDate;

    public Food(String itemName, LocalDate expiryDate) {
        this.itemName = itemName;
        this.expiryDate = expiryDate;
    }

    public String getItemName() {
        return itemName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
