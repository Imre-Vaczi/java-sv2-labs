package controlselection.month;

public class DayInMonth {
    public int getDayInMonth(int year, String month){
        int leapYear;
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)){
            leapYear = 1;
        }else{
            leapYear = 0;
        }
        month = month.toLowerCase();
        int result;
        switch (leapYear){
            case 0:
                switch (month){
                    case "január":
                        return 31;
                    case "február":
                        return 28;
                    case "március":
                        return 31;
                    case "április":
                        return 30;
                    case "május":
                        return  31;
                    case "június":
                        return 30;
                    case "július":
                        return  31;
                    case "augusztus":
                        return 31;
                    case "szeptember":
                        return 30;
                    case "október":
                        return 31;
                    case "november":
                        return 30;
                    case "december":
                        return 31;
                }
            case 1:
                switch (month){
                    case "január":
                        return 31;
                    case "február":
                        return 29;
                    case "március":
                        return 31;
                    case "április":
                        return 30;
                    case "május":
                        return  31;
                    case "június":
                        return 30;
                    case "július":
                        return  31;
                    case "augusztus":
                        return 31;
                    case "szeptember":
                        return 30;
                    case "október":
                        return 31;
                    case "november":
                        return 30;
                    case "december":
                        return 31;
                }
            default:
                return 0;
        }
    }
}
