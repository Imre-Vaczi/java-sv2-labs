package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name nameOne = new Name("Kovács", null, "Péter", null);
        System.out.println(nameOne.concatNameHungarianStyle());
        Name nameTwo = new Name("Smith", "Patrick", "Norm", Title.DR);
        System.out.println(nameTwo.concatNameWesternStyle());
    }

}
