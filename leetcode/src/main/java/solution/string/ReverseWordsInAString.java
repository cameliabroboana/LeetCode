package solution.string;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] sSplit = s.split("\s+");
        StringBuilder result = new StringBuilder();
        for(int i = sSplit.length - 1; i >= 1; i--) {
            result.append(sSplit[i]);
            result.append(" ");
        }
        result.append(sSplit[0]);

        return result.toString();
    }
}
