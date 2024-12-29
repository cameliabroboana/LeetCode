package solution.array;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static solution.util.TestUtils.convertToIntArray;

public class RemoveDuplicatesUnitTest {

    private final RemoveDuplicates solution = new RemoveDuplicates();

    @Test(dataProvider = "dataProvider")
    public void testRemoveDuplicates(List<Integer> nums, int k) {
        int[] nums1 = convertToIntArray(nums);
        assertThat(solution.removeDuplicates(nums1)).isEqualTo(k);
    }

    @Test(dataProvider = "dataProvider")
    public void testRemoveDuplicatesV1(List<Integer> nums, int k) {
        int[] nums1 = convertToIntArray(nums);
        assertThat(solution.removeDuplicatesV1(nums1)).isEqualTo(k);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {asList(2, 2, 2, 3), 2},
                {asList(2, 2, 2, 2, 3), 2},
                {asList(2, 2, 2, 2, 3, 4, 5), 4},
                {asList(1, 2, 3, 4), 4},
                {asList(2, 2, 2), 1},
                {asList(1, 2, 2), 2},
                {asList(1, 1, 2, 2), 2}
        };
    }
}