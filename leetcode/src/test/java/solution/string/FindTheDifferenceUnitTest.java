package solution.string;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindTheDifferenceUnitTest {

    FindTheDifference solution = new FindTheDifference();

    @Test(dataProvider = "dataProvider")
    public void testFindTheDifference(String s, String t, char expectedOddChar) {
        assertThat(solution.findTheDifferenceV1(s, t)).isEqualTo(expectedOddChar);
        assertThat(solution.findTheDifferenceV2(s, t)).isEqualTo(expectedOddChar);
    }

    @DataProvider
    private Object[][] dataProvider() {
        /*
            Returns:
            - string s
            - string t (s shuffled + 1 extra char)
            - odd char in t
        */
        return new Object[][] {
                {"abcd", "abcde", 'e'},
                {"", "t", 't'},
                {"aaa", "aaaa", 'a'}
        };
    }
}