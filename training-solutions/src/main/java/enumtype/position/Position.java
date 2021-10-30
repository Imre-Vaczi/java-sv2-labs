package enumtype.position;

public enum Position {
    ARCHITECT(1000, "free pencil"), DESIGNER(1000, "free brush");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
