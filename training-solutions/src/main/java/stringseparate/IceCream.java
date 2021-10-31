package stringseparate;

public class IceCream {
    public static void main(String[] args) {
        String[] menu = new String[]{"csoki", "vanília", "eper", "citrom", "puncs"};
        StringBuilder stringBuilder = new StringBuilder("Ma kapható: ");
        for (int i = 0; i < menu.length;i++){
            if (i != menu.length-1 ){
                stringBuilder.append(menu[i] + ", ");
            }else{
                stringBuilder.append(menu[i]+".");
            }
        }stringBuilder.append(" Gyerekeknek féláron!");
        System.out.println(stringBuilder.toString());
    }
}
