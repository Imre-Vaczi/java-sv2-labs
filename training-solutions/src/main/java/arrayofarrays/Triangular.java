package arrayofarrays;

public class Triangular {
    int[][] triangularMatrix(int size){
        int[][] triangle = new int[size][];

        for (int i = 0; i < size; i++){
            triangle[i] = new int[1+i];
            for (int j = 0; j <= i; j++){
                triangle[i][j] = i;
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        int[][] triangle = triangular.triangularMatrix(3);

        for (int x = 0; x < triangle.length; x++){
            for (int y = 0; y < triangle[x].length; y++){
                System.out.print(triangle[x][y]+ " ");
            }
            System.out.println();
        }


    }
}
