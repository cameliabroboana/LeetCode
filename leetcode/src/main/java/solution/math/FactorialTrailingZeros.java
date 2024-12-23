package solution.math;

import java.util.HashMap;
import java.util.Map;


public class FactorialTrailingZeros {
    public int trailingZeroes(int n) {
        if (n < 5) {
            return 0;
        }

        int dividers = 1;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(5, 1);
        int number = 5 * dividers;
        while (number <= n) {
            if (map.containsKey(number / 5)) {
                map.put(number, map.get(number / 5) + 1);
            } else {
                map.put(number, 1);
            }
            number = 5 * (++dividers);
        }
        return map.values().stream().mapToInt(Integer::intValue).sum();
    }
}
