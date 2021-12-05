package abstractclass.absztrakt.exercise;

public class MathLesson {

    public static void main(String[] args) {

        MathExercise adder = new Adder();
        System.out.println(adder.getSolution(6, 2));

        MathExercise subtracter = new Subtracter();
        System.out.println(subtracter.getSolution(6, 2));

        MathExercise multiplier = new Multiplier();
        System.out.println(multiplier.getSolution(6, 2));

        MathExercise divisor = new Divisor();
        System.out.println(divisor.getSolution(6, 2));
    }
}