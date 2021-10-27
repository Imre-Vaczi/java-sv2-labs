package introconstructors;

import java.time.LocalDateTime;

public class Task {
    public String title;
    public String description;
    public LocalDateTime startDateTime;
    public int duration;

    public Task(String title, String description, int duration) {
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    public void start(){
        this.startDateTime = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {
        Task task = new Task("swimming","cardio",60);
        System.out.println(task.getTitle()+" "+task.getDescription()+" "+task.getDuration());
        task.start();
        System.out.println(task.getStartDateTime());
    }
}
