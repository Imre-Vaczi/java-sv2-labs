package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> listOfDrives) {
        Pendrive topDrive = listOfDrives.get(0);
        for (int i = 0; i < listOfDrives.size(); i++) {
            if (topDrive.comparePricePerCapacity(listOfDrives.get(i)) == 1) {
                topDrive = listOfDrives.get(i);
            }
        }
        return topDrive;
    }

    public Pendrive getCheapest(List<Pendrive> listOfDrives) {
        Pendrive cheapestDrive = listOfDrives.get(0);
        for (Pendrive drive : listOfDrives) {
            if (drive.isCheaperThan(cheapestDrive)) {
                cheapestDrive = drive;
            }
        }
        return cheapestDrive;
    }

    public void risePriceWhereCapacity(List<Pendrive> listOfDrives, int percent, int capacity) {
        for (Pendrive drive : listOfDrives) {
            if (drive.getCapacity() == capacity) {
                drive.risePrice(percent);
            }
        }
    }
}
