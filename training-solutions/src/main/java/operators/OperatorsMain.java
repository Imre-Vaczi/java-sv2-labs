package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(operators.getI());
        System.out.println(operators.getiToBinary());

        System.out.println(operators.isEmpty("alma"));
        System.out.println(operators.isEmpty(""));

        System.out.println(operators.isNull(null));
        System.out.println(operators.isNull("null"));
    }
}
