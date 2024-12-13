package solution.string;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LengthOfLastWordUnitTest {

    LengthOfLastWord solution = new LengthOfLastWord();

    @Test(dataProvider = "dataProvider")
    public void testLengthOfLastWord(String s, int length) {
        assertThat(solution.lengthOfLastWord(s)).isEqualTo(length);
        assertThat(solution.lengthOfLastWordV2(s)).isEqualTo(length);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][] {
                {"Hello World", 5},
                {"   fly me   to   the moon  ", 4},
                {"luffy is still joyboy", 6}
        };
    }
}