public class Program {

    public static void main(String[] args) {
        var tokenizer = new Tokenizer();
        var result = tokenizer.tokenizeParagraph("This is sample test from Dr. Ken Jeong. St. Petersburg is not in the U.S.A.!");
        for (var r : result) {
            System.out.println(r.getValue());
            System.out.println(r.getWords());
        }
    }
}