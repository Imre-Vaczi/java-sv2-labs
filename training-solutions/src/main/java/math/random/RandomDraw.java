package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    private List<String> data = new ArrayList(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"));
    Random random = new Random();
    int draw_1 = random.nextInt(5);
    int draw_2 = random.nextInt(6) + 5;

    public static void main(String[] args) {
        RandomDraw randomDraw = new RandomDraw();
        System.out.println(randomDraw.data.get(randomDraw.draw_1));
        System.out.println(randomDraw.data.get(randomDraw.draw_2));
    }

}
