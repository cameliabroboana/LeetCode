package solution.hashtable;


import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.equals(t)) {
            return true;
        }

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            if (!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i))) {
                return false;
            }
            if (!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }

    public boolean isIsomorphicV2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Arrays to store mapping of characters
        int[] sToT = new int[256];
        int[] tToS = new int[256];

        // Fill arrays with -1 as default value
        for (int i = 0; i < 256; i++) {
            sToT[i] = -1;
            tToS[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check s -> t mapping
            if (sToT[sChar] == -1) {
                sToT[sChar] = tChar;
            } else if (sToT[sChar] != tChar) {
                return false; // Conflict in mapping
            }

            // Check t -> s mapping
            if (tToS[tChar] == -1) {
                tToS[tChar] = sChar;
            } else if (tToS[tChar] != sChar) {
                return false; // Conflict in mapping
            }
        }

        return true;
    }
}
