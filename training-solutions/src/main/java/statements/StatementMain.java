package statements;

public class StatementMain {
    public static void main(String[] args) {
        int x = 5 + 6;
        System.out.println(x);
        int y = 11 - x;
        System.out.println(y);
        int z = 8;
        System.out.println(z);
        boolean b = x > y ? true : false;
        System.out.println(b);
        boolean c = ((b == true) || (z > 5)) ? true : false;
        System.out.println(c);
        z++;
        System.out.println(z);


    }
}