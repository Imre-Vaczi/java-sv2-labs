package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> content = new ArrayList<>();
        content.add("apples");
        content.add("grapes");
        content.add("yoghurt");
        content.add("tomatoes");
        content.add("eggs");


        System.out.println("Number of items in the freezer: " + content.size());
        System.out.println("Content of the freezer: ");
        for (String item: content){
            System.out.print(item + " ");
        }
        System.out.println();
        content.remove("eggs");
        content.remove("tomatoes");

        System.out.println("Number of items in the freezer: " + content.size());
        System.out.println("Content of the freezer: ");
        for (String item: content){
            System.out.print(item + " ");
        }

    }

}
