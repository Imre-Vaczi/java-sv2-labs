package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {

        School norm = new School("a", 1990);
        School prim = new PrimarySchool("a", 1990);
        School seco = new SecondarySchool("a", 1990);

        System.out.println(norm.toString());
        System.out.println(prim.toString());
        System.out.println(seco.toString());

    }
}
