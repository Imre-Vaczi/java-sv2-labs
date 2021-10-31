package operators;

public class Operators {
    private int i = 21;
    private String iToBinary = Integer.toBinaryString(i);

    public boolean isEven(int n){
        if (n %2 ==0){
            return true;
        } else {
            return false;
        }
    }
    public String isNull(String s){
        if (s == null){
            return "null értékű";
        }else {
            return "nem null értékű";
        }
    }
    public boolean isEmpty(String s){
        if (s == ""){
            return true;
        } else if (s == null){
            return true;
        }else{
            return false;
        }
    }

    public int getI() {
        return i;
    }

    public String getiToBinary() {
        return iToBinary;
    }
}
