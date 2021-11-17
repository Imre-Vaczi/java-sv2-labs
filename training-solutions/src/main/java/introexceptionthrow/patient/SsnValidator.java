package introexceptionthrow.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {

        int product = 0;

        for (int i = 0; i < ssn.length()-1; i++){
            if (i % 2 == 0) {
                product += ssn.toCharArray()[i] * 7;
            }else {
                product += ssn.toCharArray()[i] * 3;
            }
        }

        boolean length = ssn.length() == 9;
        boolean securityCode = (product % 10) == Integer.parseInt(String.valueOf(ssn.charAt(8)));

        if (length & securityCode){
            return true;
        }throw new IllegalArgumentException("A megadott TAJ szám nem felel meg az elvárásoknak.");
    }
}
