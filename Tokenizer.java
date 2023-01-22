import java.util.ArrayList;

public class Tokenizer {
    
    // can be loaded from a file
    String[] delimiters = {".", "!", "?"};

    // can be loaded from a file
    String[] abbreviations = { "Dr.", "St." };

    public Tokenizer() {
        
    }

    public ArrayList<Sentence> tokenizeParagraph(String paragraph) {
        var result = new ArrayList<Sentence>();
        var words = paragraph.split(" ");
        var artifacts = new ArrayList<String>();

        for (String w : words) {
            if (isDelimeter(w) && !isAbbreviation(w)) {
                artifacts.add(w);
                // you might need to sanitize the words
                // i.e Remove puncuations;
                var value = String.join(" ", artifacts);
                result.add(new Sentence(value, artifacts));
                artifacts = new ArrayList<>();
            }
            else {
                artifacts.add(w);    
            }
        }

        return result;
    }

    private boolean isDelimeter(String value) {
        for(String delimiter : delimiters) {
            if (value.lastIndexOf(delimiter) == value.length() - 1) {
                return true;
            }
        }

        return false;
    }

    private boolean isAbbreviation(String word) {
        for (String a : abbreviations) {
            if (a.toLowerCase().equals(word.toLowerCase())) {
                return true;
            }
        }

        return false;
    }
}