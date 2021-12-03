package inheritanceconstructor.tea;

import inheritanceconstructor.tea.HerbalTea;
import inheritanceconstructor.tea.Tea;

public class TeaMain {

    public static void main(String[] args) {

        Tea tea = new Tea("green", 1000);
        System.out.println(tea.getName());
        System.out.println(tea.getPrice());

        HerbalTea herbalTea = new HerbalTea("mate", 1400);
        System.out.println(herbalTea.getName());
        System.out.println(herbalTea.getPrice());
    }
}
