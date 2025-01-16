package solution.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        String prefix = strs[0];
        for (String str : strs) {
            if (str.length() < prefix.length()) {
                prefix = str;
            }
        }
        for (int i = 0; i < strs.length && !prefix.isEmpty(); i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
