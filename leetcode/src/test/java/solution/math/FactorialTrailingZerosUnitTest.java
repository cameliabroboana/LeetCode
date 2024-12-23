package solution.math;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTrailingZerosUnitTest {

    FactorialTrailingZeros solution = new FactorialTrailingZeros();

    @Test(dataProvider = "dataProvider")
    public void trailingZeroesTest(int n, int zeros) {
        assertThat(solution.trailingZeroes(n)).isEqualTo(zeros);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {3, 0},
                {5, 1},
                {0, 0},
                {30, 7},
                {50, 12},
                {126, 31}
        };
    }

}