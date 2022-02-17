package activity;

public class Coordinate {

    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        validateInputs(latitude, "latitude");
        validateInputs(longitude, "longitude");
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private void validateInputs(double input, String cooType) {
        if (input < -180 | input > 180) {
            throw new IllegalArgumentException("Invalid " + cooType +", not in range [-180,180]");
        }
    }
}
