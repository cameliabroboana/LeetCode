package solution.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i)) && !Objects.equals(map.get(pattern.charAt(i)), words[i])) {
                return false;
            }
            if (!map.containsKey(pattern.charAt(i)) && map.containsValue(words[i])) {
                return false;
            }
            if (!map.containsKey(pattern.charAt(i)) && !map.containsValue(words[i])) {
                map.put(pattern.charAt(i), words[i]);
            }
        }

        return true;
    }
}
