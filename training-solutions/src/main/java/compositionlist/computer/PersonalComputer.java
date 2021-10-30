package compositionlist.computer;

import java.util.ArrayList;

public class PersonalComputer {
    private ArrayList<Hardware> hardwares = new ArrayList<>();
    private ArrayList<Software> softwares = new ArrayList<>();
    private Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public void addHardware(Hardware hardware){
        this.hardwares.add(hardware);
    }
    public void addSoftware(Software software){
        this.softwares.add(software);
    }

    @Override
    public String toString() {
        return "PersonalComputer/" + "\n" +
                "hardwares: " + hardwares +"\n" +
                "softwares: " + softwares +"\n" +
                "cpu: " + cpu +
                '/';
    }

    public ArrayList<Hardware> getHardwares() {
        return hardwares;
    }

    public ArrayList<Software> getSoftwares() {
        return softwares;
    }

    public Cpu getCpu() {
        return cpu;
    }
}
