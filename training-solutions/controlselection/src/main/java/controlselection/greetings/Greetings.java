package controlselection.greetings;

import java.time.LocalTime;
import java.util.Scanner;

public class Greetings {
    private int hour;
    private int minute;
    private LocalTime actualTime;
    private String respond;

    public String sayHello(int hour, int minute){

        actualTime = LocalTime.of(hour, minute);

        if (actualTime.isAfter(LocalTime.of(5,0)) & actualTime.isBefore(LocalTime.of(9,0))){
            respond = "Jó reggelt!";
        } else if (actualTime.isAfter(LocalTime.of(9,0)) & actualTime.isBefore(LocalTime.of(18,30))){
            respond = "Jó napot!";
        }else if (actualTime.isAfter(LocalTime.of(18,30)) & actualTime.isBefore(LocalTime.of(20,0))){
            respond = "Jó estét!";
        }else{
            respond = "Jó éjt!";
        }return respond;
    }
}
