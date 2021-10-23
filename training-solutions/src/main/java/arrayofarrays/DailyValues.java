package arrayofarrays;

public class DailyValues {

    public void getValues(){
        int[] lengthOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[][] months = new int[12][];
        for (int x = 0; x < lengthOfMonths.length; x++){
            months[x] = new int[lengthOfMonths[x]];
        }

        for (int x = 0; x < months.length; x++){
            for (int y = 0; y < months[x].length; y++){
                System.out.print(months[x][y]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        dailyValues.getValues();
    }
}
