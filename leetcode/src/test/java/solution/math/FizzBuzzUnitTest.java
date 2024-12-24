package solution.math;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzUnitTest {

    private FizzBuzz solution = new FizzBuzz();

    @Test(dataProvider = "dataProvider")
    public void testFizzBuzz(int n, List<String> expected) {
        assertThat(solution.fizzBuzz(n)).isEqualTo(expected);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {3, List.of("1", "2", "Fizz")}
        };
    }


}