package arrayofarrays;

import array.ArrayHandler;

public class ArrayOfArrays {

    void printArrayOfArrays(int[][] a){
        for (int[] x: a){
            for (int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int [][] myArray = { {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2} };
        arrayOfArrays.printArrayOfArrays(myArray);

    }
}
