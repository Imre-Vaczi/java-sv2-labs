package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public void getWordsStartWith(String prefix){
        List<String> tempDeletion = new ArrayList<>();
        for (String word : words){
            if (!word.startsWith(prefix)){
                tempDeletion.add(word);
            }
        }words.removeAll(tempDeletion);
    }
    public void getWordsWithLength(int length){
        List<String> tempDeletion = new ArrayList<>();
        for (String word : words){
            if (!(word.length()==length)){
                tempDeletion.add(word);
            }
        }words.removeAll(tempDeletion);
    }

    public void addWord(String word){
        this.words.add(word);
    }

    public List<String> getWords() {
        return words;
    }
}
