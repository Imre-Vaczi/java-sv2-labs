package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a+""+b);

        double quotient = 3/4;
        System.out.println(quotient);
        quotient = 3/(4 * 1.0);
        System.out.println(quotient);

        //long big = 3_244_444_444;
        //System.out.println(big);

        String word = "title".toUpperCase();
        System.out.println(word);

        Integer c = 1;
        Integer d = -2;
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));

    }

}
