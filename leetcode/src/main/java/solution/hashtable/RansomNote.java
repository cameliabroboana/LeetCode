package solution.hashtable;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            map.put(ransomNote.charAt(i), map.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for (int i = 0; i < magazine.length() && !map.isEmpty(); i++) {
            if (map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) - 1);
                if (map.get(magazine.charAt(i)) == 0) {
                    map.remove(magazine.charAt(i));
                }
            }
        }
        return map.isEmpty();
    }

    public boolean canConstructV2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] neededLetters = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            neededLetters[ransomNote.charAt(i) - 97]++;
        }
        int count = 0;
        for (int i = 0; i < neededLetters.length; i++) {
            if (neededLetters[i] != 0) {
                count++;
            }
        }
        for (int i = 0; i < magazine.length(); i++) {
            neededLetters[magazine.charAt(i) - 97]--;
            if (neededLetters[magazine.charAt(i) - 97] == 0) {
                count--;
            }
        }
        return count == 0;
    }

    public boolean canConstructV3(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] neededLetters = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            neededLetters[magazine.charAt(i) - 97]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            neededLetters[ransomNote.charAt(i) - 97]--;
            if (neededLetters[ransomNote.charAt(i) - 97] == -1) {
                return false;
            }
        }
        return true;
    }
}
