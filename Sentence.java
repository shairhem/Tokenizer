import java.util.ArrayList;

public class Sentence {
    private String _value;
    private ArrayList<String> _words;

    public Sentence(String value, ArrayList<String> words) {
        this._value = value;
        this._words = words;
    }

    public String getValue() {
        return this._value;
    }

    public ArrayList<String> getWords() {
        return this._words;
    }
}