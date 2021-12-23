package virtualmethod.grammar;

public class PhrasalVerb extends Verb implements Preposition{

    protected String preposition;

    public PhrasalVerb(String word, String preposition) {
        super(word);
        this.preposition = preposition;
    }

    public PhrasalVerb(String word) {
        super(word);
    }

    @Override
    public String getWord() {
        return super.getWord();
    }

    @Override
    public String getPreposition() {
        return preposition;
    }

    @Override
    public String getWholeWord() {
        return preposition + word;
    }
}
