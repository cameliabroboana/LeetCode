package solution;

/*
    28. Find the Index of the First Occurrence in a String

    Given two strings "needle" and "haystack", return the index of the first occurrence of needle in haystack,
    or -1 if needle is not part of haystack.
*/

public class FindIndexFirstOccurrenceString {

    public int strStrV1(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        int startIndex = -1;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                startIndex = i;
                if ((i + j >= haystack.length()) || haystack.charAt(i + j) != needle.charAt(j)) {
                    startIndex = -1;
                    break;
                }
            }
            if (startIndex != -1) {
                return startIndex;
            }
        }

        return startIndex;
    }

    public int strStrV2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
