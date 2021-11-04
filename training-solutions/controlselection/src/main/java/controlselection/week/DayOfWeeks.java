package controlselection.week;

public class DayOfWeeks {
    public String orientDuringTheWeek(String dayOfTheWeek){
        String filler = dayOfTheWeek.trim().toLowerCase();
        switch (filler){
            case "hétfő":
                return "hét eleje";
            case "kedd":
            case "szerda":
            case "csütörtök":
                return "hét közepe";
            case "péntek":
                return "majdnem hétvége";
            case "szombat":
            case "vasárnap":
                return "hét vége";
            default:
                return "ismeretlen nap";
        }
    }

}


/*
    Írj egy metódust, mely várja a hét egy napját,
        és hétfő esetén azt adja vissza,
        hogy “hét eleje” van, kedd, szerda és csütörtök esetén, hogy “hét közepe” van, pénteken “majdnem hétvége”,
        és szombat és vasárnap esetén “hét vége”!

        Figyelj arra, hogy ne számítson a kis- és nagybetű különbség!

        Ha nem ismert a nap, a metódus adja vissza azt, hogy “ismeretlen nap”!*/
