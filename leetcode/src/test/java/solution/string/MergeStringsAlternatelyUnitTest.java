package solution.string;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeStringsAlternatelyUnitTest {

    MergeStringsAlternately solution = new MergeStringsAlternately();

    @Test(dataProvider = "dataProvider")
    public void testMergeAlternately(String word1, String word2, String result) {
        assertThat(solution.mergeAlternately(word1, word2)).isEqualTo(result);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {"abc", "pqr", "apbqcr"},
                {"ab", "pqrs", "apbqrs"},
                {"abcd", "pq", "apbqcd"}
        };
    }
}