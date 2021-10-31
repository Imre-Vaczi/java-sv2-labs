package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double number){
        int temp = (int) number;
        double result = temp;
        return result;
    }
    public byte[] convertIntArrayToByteArray(int[] array){
        byte[] result = new byte[array.length];
        for (int i = 0; i < array.length; i++){
            if ((array[i] <= 127)&(array[i] >= 0)){
                result[i] = (byte) array[i];
            }else{
                result[i] = (byte) -1;
            }
        }
        return result;
    }
    public int getFirstDecimal(double number){
        int temp = (int) number;
        int result = (int)((number - temp) * 10);
        return result;
    }
}
