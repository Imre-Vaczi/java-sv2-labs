package primitivetypes;

public class PrimitiveTypesMain {

    int a = 2;
    Integer b = 2;
    Integer c = a;
    Integer d = b;
    Integer e = Integer.valueOf(2);
    int f = Integer.valueOf(2);
    int g = Integer.valueOf(a);
    int h = Integer.valueOf(c);
    int i = Integer.parseInt("2");
    Integer j = Integer.parseInt("2");

    boolean k = true;
    boolean l = false;
    boolean m = Boolean.valueOf(true);
    boolean n = Boolean.valueOf(false);
    boolean o = Boolean.parseBoolean("TrUe");
    Boolean p = Boolean.parseBoolean("TrUe");
    boolean q = Boolean.parseBoolean("TreU");
    Boolean r = Boolean.parseBoolean("TreU");
}
