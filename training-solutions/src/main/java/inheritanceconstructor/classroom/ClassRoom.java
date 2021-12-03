package inheritanceconstructor.classroom;

public class ClassRoom extends Room{

    private Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public boolean isSuitable(Course course) {
        return course.getFacilityNeeded().equals(facility) && course.getParticipants() <= this.getCapacity();
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Facility getFacility() {
        return facility;
    }
}
