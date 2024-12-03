package solution;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.*;

public class ValidAnagramUnitTest {

    ValidAnagram solution = new ValidAnagram();

    @Test(dataProvider = "dataProvider")
    public void testIsAnagram(String s, String t, boolean isAnagram) {
        assertThat(solution.isAnagram(s, t)).isEqualTo(isAnagram);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {"anagram", "nagaram", true},
                {"rat", "car", false}
        };
    }
}