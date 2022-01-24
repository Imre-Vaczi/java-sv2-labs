package collectionslist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FoodStoreTest {

    @Test
    void testAdd() {
        FoodStore foodStore = new FoodStore();
        foodStore.addFood(new Food("apple", LocalDate.of(2022,2,25)));
        assertEquals(1, foodStore.getInventory().size());
    }

    @Test
    void testSellFirst() {
        FoodStore foodStore = new FoodStore();
        foodStore.addFood(new Food("frozenApple", LocalDate.now().plusDays(30)));
        foodStore.sellFirst(new Food("pear", LocalDate.now()));
        assertEquals("pear", foodStore.getInventory().get(0).getItemName());
    }

}