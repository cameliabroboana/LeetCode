package solution;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindIndexFirstOccurrenceStringUnitTest {

    FindIndexFirstOccurrenceString solution = new FindIndexFirstOccurrenceString();

    @Test(dataProvider = "dataProvider")
    public void testStrStr(String haystack, String needle, int expectedIndex) {
        assertThat(solution.strStrV1(haystack, needle)).isEqualTo(expectedIndex);
        assertThat(solution.strStrV2(haystack, needle)).isEqualTo(expectedIndex);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {"sadbutsad", "sad", 0},
                {"leetcode", "leeto", -1}
        };
    }
}