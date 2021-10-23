package arrayofarrays;

public class Rectangle {

    public void rectangularMatrix(int size) {
        int[][] rectangle = new int[size][size];
        for (int x = 0; x < size; x++) {
            rectangle[x] = new int[size];
            for (int y = 0; y < size; y++) {
                rectangle[x][y] = x;
                System.out.print(rectangle[x][y]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.rectangularMatrix(5);
    }
}