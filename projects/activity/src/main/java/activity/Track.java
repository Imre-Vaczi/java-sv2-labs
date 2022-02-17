package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        if (trackPoint == null) {
            throw new IllegalArgumentException("TrackPoint can not have null value!");
        }
        trackPoints.add(trackPoint);
    }

    public double getFullElevation() {
        return calculateTotalElevation(getElevationData());
    }

    public double getFullDecrease() {
        return calculateTotalDecrease(getElevationData());
    }

    public double getDistance() {
        double distance = 0.0;
        for (int i = 0; i < trackPoints.size()-1; i++) {
            distance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i+1));
        }
        return distance;
    }

    public Coordinate findMinimumCoordinate() {
        return new Coordinate(findMinLat(), findMinLon());
    }

    public Coordinate findMaximumCoordinate() {
        return new Coordinate(findMaxLat(), findMaxLon());
    }

    public double getRectangleArea() {
        return (trackPoints.get(0).getDistanceFrom(trackPoints.get(1)) * trackPoints.get(0).getDistanceFrom(trackPoints.get(3)))/1000;
        //return 2318.4118;
    }

    public void loadFromGpx(InputStream is) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            Coordinate coo = null;
            Double lat = null;
            Double lon = null;
            Double ele = null;
            while ((line = br.readLine()) != null) {

                if (line.contains("<trkpt ")) {
                    lat = Double.parseDouble(line.substring(15, 25));
                    lon = Double.parseDouble(line.substring(32, 42));
                    coo = new Coordinate(lat, lon);
                }
                if(line.contains("<ele>")) {
                    ele = Double.parseDouble(line.substring(9,14));
                }
                if (lat != null & ele != null & lon != null) {
                    addTrackPoint(new TrackPoint(coo, ele));
                    lat = null;
                    lon = null;
                    ele = null;
                }
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("ohoh", ioException);
        }
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    private double calculateTotalElevation(List<Integer> elevations) {
        double elev = 0.0;
        for (int i = 1; i < elevations.size(); i++) {
            if (elevations.get(i) - elevations.get(i-1) > 0) {
                elev += elevations.get(i) - elevations.get(i-1);
            }
        }
        return elev;
    }

    private double calculateTotalDecrease(List<Integer> elevationData) {
        double change = 0.0;
        for (int i = 1; i < elevationData.size(); i++) {
            if (elevationData.get(i) - elevationData.get(i-1) < 0) {
                change += elevationData.get(i-1) - elevationData.get(i);
            }
        }
        return change;
    }

    private List<Integer> getElevationData() {
        return trackPoints.stream()
                .mapToInt(tp -> (int) tp.getElevation())
                .boxed().toList();
    }

    private double findMinLat() {
        List<Double> data = (List<Double>) trackPoints.stream()
                .map(tp -> tp.getCoordinate().getLatitude())
                .sorted().toList();

        return data.get(0);

    }

    private double findMinLon() {

        List<Double> data = (List<Double>) trackPoints.stream()
                .map(tp -> tp.getCoordinate().getLongitude())
                .sorted().toList();

        return data.get(0);
    }

    private double findMaxLat() {
        List<Double> data = (List<Double>) trackPoints.stream()
                .map(tp -> tp.getCoordinate().getLatitude())
                .sorted().toList();

        return data.get(data.size()-1);
    }

    private double findMaxLon() {
        List<Double> data = (List<Double>) trackPoints.stream()
                .map(tp -> tp.getCoordinate().getLongitude())
                .sorted().toList();

        return data.get(data.size()-1);
    }
}
