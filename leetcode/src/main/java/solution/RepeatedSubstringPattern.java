package solution;

/*
    459. Repeated Substring Pattern

    Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

    Constraints:
        1 <= s.length <= 104
        s consists of lowercase English letters.
*/

public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        if (s.isEmpty()) {
            return false;
        }
        if (s.length() == 1) {
            return false;
        }

        int index = 1; StringBuilder pattern = new StringBuilder(s.substring(0, index));
        int start = pattern.length();
        int end = pattern.length() * 2;
        while (!pattern.toString().equals(s) && (start < s.length() && end <= s.length())) {
            String next = s.substring(start, end);
            if (pattern.toString().equals(next)) {
                start = end;
                end = start + pattern.length();
            } else {
                pattern.append(s.charAt(index++));
                start = pattern.length();
                end = pattern.length() * 2;
            }
        }

        return (s.length() % pattern.length() == 0) && (!pattern.toString().equals(s));
    }
}
