package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {

    private List<Food> inventory = new LinkedList<>();

    public List<Food> getInventory() {
        return inventory;
    }

    public void addFood(Food food) {
        inventory.add(food);
    }

    public void sellFirst(Food food) {
        if (food.getExpiryDate().equals(LocalDate.now())) {
            inventory.add(0, food);
        }
    }
}
