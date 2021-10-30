package chars;

public class LettersAndDigits {
    public String printLetterOrDigit(String text){
        String message = "";
        for (char c: text.toCharArray())
            if (Character.isAlphabetic(c)) {
                message += c + " : betű" + "\n";
            } else if (Character.isDigit(c)) {
                message += c + " : számjegy" + "\n";
            } else {
                message += c + " : egyéb" + "\n";
            }
        return message;
        }

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        System.out.println(lettersAndDigits.printLetterOrDigit("bfa68fF;X"));
        }
    }


/*
for (char c: s.toCharArray()) {
        System.out.println(c);
        System.out.println(Character.isAlphabetic(c));
        }*/
