package array;

public class ArrayHandler {
    void addIndexToNumber(int[] source){
        for (int i = 0; i < source.length; i++){
            source[i] = source[i] + i;
        }
    }

    void concatenateIndexToWord(String[] source){
        for (int i = 0; i < source.length; i++){
            source[i] = i +": "+source[i];
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        String[] sourceString = {"apple", "peach", "plum", "orange"};
        int[] sourceInt = {1, 2, 3, 4};

        arrayHandler.addIndexToNumber(sourceInt);
        arrayHandler.concatenateIndexToWord(sourceString);

        for (String element: sourceString){
            System.out.println(element+ ", ");
        }
        System.out.println("\n");
        for (String element: sourceString){
            System.out.print(element+ ", ");
        }
        System.out.println("\n");
        for (int element: sourceInt){
            System.out.println(element+ ", ");
        }
        System.out.println("\n");
        for (int element: sourceInt){
            System.out.print(element+ ", ");
        }
    }


}
