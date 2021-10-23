package arrays;
import java.util.Arrays;
public class ArraysMain {

    public String numberOfDaysAsString(){
        int[] lengthOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(lengthOfMonths);
    }

    public String multiplicationTableAsString(int size){
        int[][] multyplTable = new int[size][size];
        for (int x = 0; x < size; x++){
            multyplTable[x] = new int[size];
            for (int y = 0; y < size; y++){
                multyplTable[x][y] = (x+1)*(y+1);
            }
        }
        return Arrays.deepToString(multyplTable);
    }
    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }
    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        if (day.length < anotherDay.length){
            double[] rangeDay = Arrays.copyOfRange(day,0, day.length);
            double[] rangeAnotherDay = Arrays.copyOfRange(anotherDay,0,day.length);
            return Arrays.equals(rangeDay, rangeAnotherDay);
        } else{
            double[] rangeDay = Arrays.copyOfRange(day,0, anotherDay.length);
            double[] rangeAnotherDay = Arrays.copyOfRange(anotherDay,0, anotherDay.length);
            return Arrays.equals(rangeAnotherDay, rangeDay);
        }
    }

    public boolean wonLottery(int[] firstRange, int[] secondRange){
        int [] copyForFirstOne = Arrays.copyOf(firstRange, firstRange.length);
        int [] copyForSecondOne = Arrays.copyOf(secondRange, secondRange.length);
        Arrays.sort(copyForFirstOne);
        Arrays.sort(copyForSecondOne);
        return Arrays.equals(copyForFirstOne, copyForSecondOne);

    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.multiplicationTableAsString(5));
        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{1, 2, 3}, new double[]{1, 2, 3}));
        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{1, 3}, new double[]{1, 2, 3}));
        System.out.println(arraysMain.wonLottery(new int[] {4, 3, 1, 2}, new int[] {1, 2, 4, 3}));
        System.out.println(arraysMain.wonLottery(new int[] {4, 5, 1, 2}, new int[] {1, 2, 4, 3}));
    }

}
