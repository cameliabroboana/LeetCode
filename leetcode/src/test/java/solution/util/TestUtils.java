package solution.util;

import java.util.List;

public class TestUtils {

    public static int[] convertToIntArray(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
