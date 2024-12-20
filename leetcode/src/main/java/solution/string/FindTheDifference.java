package solution.string;

/*
    389. Find the Difference

    You are given two strings s and t.
    String t is generated by random shuffling string s and then add one more letter at a random position.
    Return the letter that was added to t.
*/

public class FindTheDifference {

    public char findTheDifferenceV1(String s, String t) {
        if (s.isEmpty())
            return t.charAt(0);

        String oddChar = String.valueOf(t.charAt(0));
        while (!t.isEmpty()) {
            oddChar = String.valueOf(t.charAt(0));
            if (!s.contains(oddChar))
                return oddChar.charAt(0);
            t = t.replaceFirst(oddChar, "");
            s = s.replaceFirst(oddChar, "");
        }

        return oddChar.charAt(0);
    }

    public char findTheDifferenceV2(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            t = t.replaceFirst(String.valueOf(t.charAt(t.indexOf(s.charAt(i)))), "");
        }

        return t.charAt(0);
    }
}
