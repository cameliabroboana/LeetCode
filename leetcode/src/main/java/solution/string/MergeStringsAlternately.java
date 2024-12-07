package solution.string;

/*
    1768. Merge Strings Alternately

    You are given two strings word1 and word2.
    Merge the strings by adding letters in alternating order, starting with word1.
    If a string is longer than the other, append the additional letters onto the end of the merged string.

    Return the merged string.
*/

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < word1.length() || index < word2.length(); index++) {
            if (index < word1.length()) {
                result.append(word1.charAt(index));
            }
            if (index < word2.length()) {
                result.append(word2.charAt(index));
            }
        }

        return result.toString();
    }
}
