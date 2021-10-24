package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Sequence {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList(Arrays.asList(1, 2));
        for (int step = elements.size(); step < 10; step++){
            elements.add(elements.get(step - 1) * elements.get(step - 2));
        }

        System.out.println("Size of the list: " + elements.size());
        for (int item: elements){
            System.out.print(item + " ");
        }
    }
}
