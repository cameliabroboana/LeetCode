package solution.math;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeNumberUnitTest {

    PalindromeNumber solution = new PalindromeNumber();

    @Test(dataProvider = "dataProvider")
    public void testIsPalindrome(int number, boolean isPalindrome) {
        assertThat(solution.isPalindromeV1(number)).isEqualTo(isPalindrome);
        assertThat(solution.isPalindromeV2(number)).isEqualTo(isPalindrome);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][] {
                {10, false},
                {121, true},
                {-121, false}
        };
    }
}