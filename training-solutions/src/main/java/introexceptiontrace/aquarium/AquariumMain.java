package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addFish(new Fish("nagy", "kék"));
        aquarium.addFish(new Fish("közepes", "zöld"));
        aquarium.addFish(new Fish("kicsi", "narancs"));

        System.out.println(aquarium.getNumberOfFish());

        //errors occur when methods are applied to object with null value (ornamentalFish - null pointer exception is raised)
    }
}
