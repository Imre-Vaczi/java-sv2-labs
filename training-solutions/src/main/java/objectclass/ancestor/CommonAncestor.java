package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {

    public static void main(String[] args) {

        List<Object> commonList = new ArrayList<>();

        Fruit fruit = new Fruit();
        commonList.add(fruit);

        Apple apple = new Apple();
        commonList.add(apple);

        Starking starking = new Starking();
        commonList.add(starking);

        Vegetable vegetable = new Vegetable();
        commonList.add(vegetable);

        commonList.add("alma");
        commonList.add(12);
        commonList.add('x');
        commonList.add(LocalDate.now());
        commonList.add(new int[]{1,2,3});
        commonList.add(Arrays.asList("a", "b", "c"));

        System.out.println(commonList);

    }
}
