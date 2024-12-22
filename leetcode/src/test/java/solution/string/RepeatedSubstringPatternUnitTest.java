package solution.string;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RepeatedSubstringPatternUnitTest {

    RepeatedSubstringPattern solution = new RepeatedSubstringPattern();

    @Test(dataProvider = "dataProvider")
    public void testRepeatedSubstringPattern(String s, boolean isRepeatedSubstringPattern) {
        assertThat(solution.repeatedSubstringPattern(s)).isEqualTo(isRepeatedSubstringPattern);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {"ababab", true},
                {"abcabc", true},
                {"abababd", false},
                {"", false},
                {"a", false},
                {"ab", false},
                {"abc", false},
                {"abac", false},
                {"babbabbabbabbab", true}
        };
    }
}