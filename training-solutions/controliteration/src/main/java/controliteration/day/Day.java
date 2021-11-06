package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    private List<Hour> hoursOfDay = new ArrayList<>();

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }
    public void addHour(Hour hour){
        hoursOfDay.add(hour);
    }
    public void setDayPeriod(){
        for (Hour laHour : hoursOfDay){
            if ( (laHour.getHourNumber() > 6) & (laHour.getHourNumber() <22)){
                laHour.setPeriod(DayPeriod.DAYTIME);
            }else{
                laHour.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }
}
