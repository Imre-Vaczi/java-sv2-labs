package aslist;

import java.util.Arrays;
import java.util.List;
public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("multitool", "waterfilter", "first-aid kit");
        System.out.println("My list: ");
        for (String item: importantThings){
            System.out.print(item + " ");
        }
        System.out.println();
        importantThings.set(1, "water-purifier");

        System.out.println("My updated list: ");
        for (String item: importantThings){
            System.out.print(item + " ");
        }
    }

}
