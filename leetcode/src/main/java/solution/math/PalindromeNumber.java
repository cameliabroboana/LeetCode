package solution.math;

public class PalindromeNumber {

    public boolean isPalindromeV1(int x) {
        if (x < 0) {
            return false;
        }

        String number = String.valueOf(x);
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindromeV2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }
}
