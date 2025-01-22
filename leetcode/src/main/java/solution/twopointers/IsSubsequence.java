package solution.twopointers;

public class IsSubsequence {
    // s has to be subsequence of t
    // A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
    // of the characters without disturbing the relative positions of the remaining characters.
    // (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() > t.length()) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            while (j < t.length() && s.charAt(i) != t.charAt(j)) {
                j++;
            }
            if (j == t.length()) {
                return false;
            }
            j++;
        }
        return true;
    }
}
