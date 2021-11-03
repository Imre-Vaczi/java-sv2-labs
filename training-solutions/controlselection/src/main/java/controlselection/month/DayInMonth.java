package controlselection.month;

public class DayInMonth {
    public int getDayInMonth(int year, String month){
        int leapYear;
        if (((year % 4 == 0) & (year % 100 != 0)) || ((year % 4 == 0) & (year % 100 != 0) & (year % 400 ==0))){
            leapYear = 1;
        }else{
            leapYear = 0;
        }
        month = month.toLowerCase();
        int result = 0;
        switch (leapYear){
            case 0:
                switch (month){
                    case "január":
                        result = 31;
                        break;
                    case "február":
                        result = 28;
                        break;
                    case "március":
                        result = 31;
                        break;
                    case "április":
                        result = 30;
                        break;
                    case "május":
                        result = 31;
                        break;
                    case "június":
                        result = 30;
                        break;
                    case "július":
                        result = 31;
                        break;
                    case "augusztus":
                        result = 31;
                        break;
                    case "szeptember":
                        result =30;
                        break;
                    case "október":
                        result = 31;
                        break;
                    case "november":
                        result = 30;
                        break;
                    case "december":
                        result = 31;
                        break;
                }
            case 1:
                switch (month){
                    case "január":
                        result = 31;
                        break;
                    case "február":
                        result = 29;
                        break;
                    case "március":
                        result = 31;
                        break;
                    case "április":
                        result = 30;
                        break;
                    case "május":
                        result = 31;
                        break;
                    case "június":
                        result = 30;
                        break;
                    case "július":
                        result = 31;
                        break;
                    case "augusztus":
                        result = 31;
                        break;
                    case "szeptember":
                        result =30;
                        break;
                    case "október":
                        result = 31;
                        break;
                    case "november":
                        result = 30;
                        break;
                    case "december":
                        result = 31;
                        break;
                }
        }
    return result;
    }
}
