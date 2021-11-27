package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord(List<String> wordList, String inputWord) {
        boolean result = false;
        int i = 0;

        while ((i < wordList.size()) && !result) {
            if (wordList.get(i).length() > inputWord.length()) {
                result = true;
            }
            i++;
        }
        return result;
    }
}
