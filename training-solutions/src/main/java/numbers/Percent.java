package numbers;

public class Percent {
    public double getValue(int first, int second){
        return first * (second / 100.0);
    }
    public double getBase(int first, int second){
        return first / (second / 100.0);
    }
    public double getPercent(int first, int second){
        return second / (first * 1.0);
    }


    public static void main(String[] args) {
        Percent percent = new Percent();
        System.out.println(percent.getValue(200,30));
        System.out.println(percent.getBase(60,30));
        System.out.println(percent.getPercent(200,60));
    }
}
