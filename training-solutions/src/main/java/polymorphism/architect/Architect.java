package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {
        Plan a = new SketchPlan(10, "a title");
        Plan b = new PermitPlan(10, "b", "X.Y.", "Z- st");
        Plan c = new ConstructionPlan(10, "c title", "sdf", "asdf", 20);
        //ect
    }
}
