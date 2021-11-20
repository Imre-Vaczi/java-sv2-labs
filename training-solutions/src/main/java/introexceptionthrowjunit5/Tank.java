package introexceptionthrowjunit5;

public class Tank {
    private int angle = 0;

    public int getAngle(){
        return angle;
    }

    public void modifyAngle(int angleNumber){
        angle += angleNumber;
        while (angle < 0){
            angle += 360;
        }
        while (angle > 360){
            angle -= 360;
        }
        if ((angle > 80) & (angle < 280)){
            throw new IllegalArgumentException("A pozíció érvénytelen tartományba esik.");
        }
    }
}
