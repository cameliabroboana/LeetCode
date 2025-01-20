package solution.math;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int add = digits[len - 1] + 1;
        digits[len - 1] = add % 10;
        add /= 10;
        for (int i = len - 2; i >= 0; i--) {
            add += digits[i];
            digits[i] = add % 10;
            add /= 10;
        }
        if (add != 0) {
            int[] result = new int[len + 1];
            result[0] = add;
            System.arraycopy(digits, 0, result, 1, len);
            return result;
        }
        return digits;
    }
}
