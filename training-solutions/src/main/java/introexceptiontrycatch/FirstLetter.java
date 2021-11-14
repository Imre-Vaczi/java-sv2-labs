package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.List;

public class FirstLetter {
    private List<String> listOfWords = new ArrayList<>();

    public void addWord(String word){
        listOfWords.add(word);
    }

    public List<String> getListOfWords() {
        return listOfWords;
    }

    public static void main(String[] args) {
        FirstLetter firstLetter = new FirstLetter();
        firstLetter.addWord("szék");
        firstLetter.addWord(".tánoz");
        firstLetter.addWord("7-es");
        firstLetter.addWord(" szünet");
        firstLetter.addWord(""); // StringIndexOutOfBoundsException
        firstLetter.addWord(null); //NullPointerException

        for (String s : firstLetter.getListOfWords()){
            try {
                System.out.println(s.charAt(0));
            }
            catch   (Exception exception) {
                if (exception instanceof StringIndexOutOfBoundsException){
                    System.out.println("Üres szöveg.");
                    System.out.println(exception.getMessage());
                    exception.printStackTrace();
                    System.out.println("\n");
                }else if (exception instanceof NullPointerException){
                    System.out.println("Metódus nem futtatható null értékkel");
                    System.out.println(exception.getMessage());
                    exception.printStackTrace();
                }else
                    throw new RuntimeException(exception);
            }
        }
    }
}
