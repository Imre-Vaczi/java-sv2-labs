package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        System.out.println(prefix);
        System.out.println(name );
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String str1 = "";
        String str2 = "";
        String str3 = str1 + str2;
        System.out.println(str3);
        System.out.println(str3.length());

        System.out.println("Abcde".length());
        System.out.println("Abcde".substring(1,2)+","+"Abcde".substring(3,4));
        System.out.println("Abcde".substring(1,4));

    }
}
