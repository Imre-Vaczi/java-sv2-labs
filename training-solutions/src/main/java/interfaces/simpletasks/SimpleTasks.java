package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable{

    private List<String> tasks = new ArrayList<>();

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    private boolean nextStep() {
        if (getTasks().size() == 0) {
            return false;
        } else {
            this.tasks.remove(tasks.size()-1);
            return true;
        }
    }

    @Override
    public void run() {
        while (nextStep());
    }

    public List<String> getTasks() {
        return tasks;
    }
}
