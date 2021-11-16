package introexceptionthrow;

public class Adult {
    private String name;
    private int age;

    public Adult(String name, int age) {
        this.name = name;
        if (age < 18) {
            throw new IllegalArgumentException("Figyelem, a személy 18 éven aluli, rögzítés nem lehetséges! " +
                    name + " csak " + age + " éves.");
        }
        else{this.age = age;}
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
