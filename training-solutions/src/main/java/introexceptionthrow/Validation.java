package introexceptionthrow;

public class Validation {
    public void validateName(String name){
        if ((name.equals(null)) || (name.length()==0)) {
            throw new IllegalArgumentException("A megadott név nem felel meg a kritériumoknak: nem null, nem üres.");
        }
    }

    public void validateAge(String ageString) {
        if (ageString.length() ==0){
            throw new IllegalArgumentException("Nem adott meg életkort.");
        }
        if (Integer.parseInt(ageString) < 0 || Integer.parseInt(ageString) > 120) {
            throw new IllegalArgumentException("A megadott életkor nem valid.");
        }
        for (char ch : ageString.toCharArray()) {
            if (!Character.isDigit(ch)) {
                throw new IllegalArgumentException("A megadott érték nem csak számokat tartalmaz.");
            }
        }
    }
}
