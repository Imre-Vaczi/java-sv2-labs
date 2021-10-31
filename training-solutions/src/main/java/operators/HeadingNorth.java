package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections(){
        int actualDirection = 0;
        int changeInDirection = 0;
        int numOfChanges = 0;

        while (actualDirection < 360){
            changeInDirection += 10;
            actualDirection += changeInDirection;
            numOfChanges++;
        }
        return numOfChanges;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        int result = headingNorth.getNumberOfNewDirections();
        System.out.println(result);
    }
}
