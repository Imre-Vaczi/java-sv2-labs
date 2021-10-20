package stringtype;

public class UserValidator {

    public boolean isValidUsername(String username){
        return username.length() > 0 ? true : false;
    }

    public boolean isValidPassword(String password1, String password2){
        return password1.equals(password2) & password1.length() > 7;
    }

    public boolean isValidEmail(String email){
        boolean isAtOk = email.indexOf("@") > 0;
        boolean isDotOK = email.indexOf(".",email.indexOf("@")) > email.indexOf("@") +1 & email.indexOf(".") > 0 & email.length()-1 > email.indexOf(".");
        return isAtOk & isDotOK;
    }
}
