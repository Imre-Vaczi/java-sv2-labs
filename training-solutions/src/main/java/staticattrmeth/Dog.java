package staticattrmeth;

public class Dog {
    private String name;
    private int age;
    private Species species;
    private long identification;

    public Dog(String name, int age, Species species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void setIdentification(long identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Species getSpecies() {
        return species;
    }

    public long getIdentification() {
        return identification;
    }
}
