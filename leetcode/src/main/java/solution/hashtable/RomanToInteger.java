package solution.hashtable;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToIntV1(String s) {
        Map<String, Integer> romanLettersMap = new HashMap<>();
        romanLettersMap.put("I", 1);
        romanLettersMap.put("IV", 4);
        romanLettersMap.put("V", 5);
        romanLettersMap.put("IX", 9);
        romanLettersMap.put("X", 10);
        romanLettersMap.put("XL", 40);
        romanLettersMap.put("L", 50);
        romanLettersMap.put("XC", 90);
        romanLettersMap.put("C", 100);
        romanLettersMap.put("CD", 400);
        romanLettersMap.put("D", 500);
        romanLettersMap.put("CM", 900);
        romanLettersMap.put("M", 1000);
        int number = 0;
        int i = 0;
        boolean checkedNextLetter = false;
        while (i < s.length() - 1) {
            String singleLetter = String.valueOf(s.charAt(i));
            String group = singleLetter + s.charAt(i + 1);
            if (romanLettersMap.containsKey(group)) {
                number += romanLettersMap.get(group);
                i+=2;
                checkedNextLetter = true;
            } else {
                number += romanLettersMap.get(singleLetter);
                i+=1;
                checkedNextLetter = false;
            }
        }
        if (!checkedNextLetter || i < s.length()) {
            number += romanLettersMap.get(String.valueOf(s.charAt(i)));
        }

        return number;

    }

    public int romanToIntV2(String s) {
        Map<Character, Integer> romanLettersMap = new HashMap<>();
        romanLettersMap.put('I', 1);
        romanLettersMap.put('V', 5);
        romanLettersMap.put('X', 10);
        romanLettersMap.put('L', 50);
        romanLettersMap.put('C', 100);
        romanLettersMap.put('D', 500);
        romanLettersMap.put('M', 1000);
        int number = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanLettersMap.get(s.charAt(i));
            number += (currentValue < prevValue) ? -currentValue : +currentValue;
            prevValue = currentValue;
        }

        return number;
    }
}
