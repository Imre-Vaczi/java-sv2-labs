package introexceptiontrace.numbers;

public class NumbersMain {
    public static void main(String[] args) {
        Change change = new Change();
        System.out.println(change.changeNumbers());
        //issue occurs in getNumber method, where iteration i will be out of index,
        // because it should not be equal to the length of the array
    }
}
