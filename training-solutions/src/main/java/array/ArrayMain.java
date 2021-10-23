package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(week[1]);
        System.out.println(week.length);

        int[] tomb = new int[5];
        tomb[0] = 1;
        for (int i = 1; i < tomb.length; i++){
            tomb[i] = tomb[i-1]*2;
        }
        for (int element: tomb){
            System.out.print(element + ", ");
        }

        boolean[] tomb_2 = new boolean[5];
        for (int i = 1; i < tomb_2.length; i++){
            tomb_2[i] = !tomb_2[i-1];
        }
        System.out.println("\n");
        for (boolean element: tomb_2){
            System.out.print(element + ", ");
        }

    }
}
