package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    private List<Double> data;
    private String name;

    public Run(String name) {
        this.name = name;
    }
    public void addRun(double km){
        data.add(km);
    }
    public String printFormattedRunText(){
        LocalDate actual = LocalDate.now();
        int numOfRun = this.data.size();
        double lastRun = this.data.get(numOfRun-1);
        return "na"; //String.format("Kedves %s! A mai dátum: %tc. Ezen a héten ez a(z) %d. futásod. Most %f km-t futottál. Csak így tovább!", this.name, actual, numOfRun,lastRun);
    }

    public static void main(String[] args) {
        Run run = new Run("Ato");
        run.addRun(3.4);
        run.addRun(3.1);
        run.addRun(7.1);
        run.addRun(4.1);

    }
}
