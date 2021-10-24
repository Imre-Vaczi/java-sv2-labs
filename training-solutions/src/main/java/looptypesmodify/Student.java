package looptypesmodify;

public class Student {
    private String name;
    private boolean active;

    public Student(String name){
        this.name = name;
        this.active = true;
    }

    public String getName(){
        return this.name;
    }
    public boolean getActive(){
        return this.active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
