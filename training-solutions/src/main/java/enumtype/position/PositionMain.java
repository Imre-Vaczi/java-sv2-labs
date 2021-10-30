package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        for (Position p: Position.values()){
            System.out.println("The salary in a position of " + p + " is " + p.getSalary()+", and the benefit is "+p.getBenefit());
        }
    }
}
