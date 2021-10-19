package javaapi;

import java.util.Locale;

public class Upper {
    private String message;

    public Upper(String message){
        this.message = message;
    }

    public String upperate(){
        return message.toUpperCase(Locale.ROOT);
    }

}
