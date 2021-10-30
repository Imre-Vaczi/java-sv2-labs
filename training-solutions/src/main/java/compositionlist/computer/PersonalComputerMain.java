package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        PersonalComputer pcOne = new PersonalComputer(new Cpu("cpuOne", 300));

        pcOne.addHardware(new Hardware("hwOne", "v01"));
        pcOne.addHardware(new Hardware("hwTwo", "v06"));
        pcOne.addSoftware(new Software("swOne", 10.00));
        pcOne.addSoftware(new Software("swTwo", 14.00));

        System.out.println(pcOne.toString());
    }
}
