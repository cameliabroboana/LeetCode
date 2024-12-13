package solution.string;


/*
    58. Length of Last Word

    Given a string s consisting of words and spaces, return the length of the last word in the string.
    A word is a maximal substring consisting of non-space characters only.
*/

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int length = 0; int cop = 0;
        for (int i = 0; i< s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (length != 0) {
                    cop = length;
                }
                length = 0;
            } else {
                length++;
            }
        }

        return length != 0 ? length : cop;
    }

    public int lengthOfLastWordV2(String s) {
        String[] s1 = s.split(" ");
        return s1[s1.length - 1].length();
    }
}
