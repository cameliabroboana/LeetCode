package solution.array;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumUnitTest {

    TwoSum solution = new TwoSum();

    @Test(dataProvider = "dataProvider")
    void test(int[] nums, int target, int[] result) {
        assertThat(solution.twoSum(nums, target)).containsExactlyInAnyOrder(result);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}},
                {new int[]{3, 2, 4}, 6, new int[]{1, 2}},
                {new int[]{3, 3}, 6, new int[]{0, 1}}
        };
    }

}
