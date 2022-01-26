package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainingCompany {

    private List<Course> courses = new ArrayList<>();

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> cheapOne = Optional.empty();
        for (Course course : courses) {
            if (course.getPrice() <= maxPrice) {
                cheapOne = Optional.of(course);
            }
        }
        return cheapOne.orElseThrow(()-> new IllegalArgumentException("No such course."));
    }

/*    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Course> hit = Optional.empty();
        for (Course course : courses) {
            if (course.getName().equals(name) & course.getLevel().equals(level)) {
                hit = Optional.of(course);
            }
        }
        if (hit.isPresent()) {
            return hit.get().getPrice();
        }
        hit.orElseThrow(()-> new IllegalArgumentException("No such course."));
    }*/
}
