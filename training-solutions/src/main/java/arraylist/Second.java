package arraylist;
import java.util.List;
import java.util.Arrays;
public class Second {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(3, 9, 42, 67, 4, 0, 76, 14, 84, 35, 92);
        for (int item: numList){
            if (numList.indexOf(item) %2 ==0){
                System.out.println(item);
            }
        }

    }
}
