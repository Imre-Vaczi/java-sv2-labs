package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        for (Continent c : Continent.values()) {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(Continent.values()));

        System.out.println(Ocean.valueOf("INDIAN"));
        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Ocean.valueOf("ATLANTIC"));

        System.out.println(Football.KAPUS.name());
        System.out.println(Football.CSATÁR.name());
        System.out.println(Football.KÖZÉPPÁLYÁS.name());
        System.out.println(Football.VÉDŐ.name());
    }


}
