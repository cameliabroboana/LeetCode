package solution;

import java.util.HashMap;
import java.util.Map;

/*
    242. Valid Anagram

    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
*/

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> letterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            letterMap.put(letter, letterMap.containsKey(letter) ? letterMap.get(letter) + 1 : 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char letter = t.charAt(i);
            if (!letterMap.containsKey(letter)) {
                return false;
            }
            letterMap.put(letter, letterMap.get(letter) - 1);
            if (letterMap.get(letter) == 0) {
                letterMap.remove(letter);
            }
        }

        return letterMap.isEmpty();
    }
}
