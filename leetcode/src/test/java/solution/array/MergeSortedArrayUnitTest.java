package solution.array;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static solution.util.TestUtils.convertToIntArray;

public class MergeSortedArrayUnitTest {

    private MergeSortedArray solution = new MergeSortedArray();

    @Test(dataProvider = "dataProvider")
    public void testMerge(List<Integer> nums1, int m, List<Integer> nums2, int n, List<Integer> expectedNums1) {
        int[] nums11 = convertToIntArray(nums1);
        int[] nums22 = convertToIntArray(nums2);
        solution.merge(nums11, m, nums22, n);
        assertThat(nums11).isEqualTo(convertToIntArray(expectedNums1));
    }

    @Test(dataProvider = "dataProvider")
    public void testMergeV1(List<Integer> nums1, int m, List<Integer> nums2, int n, List<Integer> expectedNums1) {
        int[] nums11 = convertToIntArray(nums1);
        int[] nums22 = convertToIntArray(nums2);
        solution.mergeV1(nums11, m, nums22, n);
        assertThat(nums11).isEqualTo(convertToIntArray(expectedNums1));
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {asList(4, 5, 6, 0, 0, 0), 3, asList(1, 2, 3), 3, asList(1, 2, 3, 4, 5, 6)},
                {asList(1, 2, 3, 0, 0, 0), 3, asList(2, 5, 6), 3, asList(1, 2, 2, 3, 5, 6)},
                {asList(1, 3, 5, 0, 0, 0), 3, asList(2, 4, 6), 3, asList(1, 2, 3, 4, 5, 6)},
                {asList(2, 4, 6, 0, 0, 0), 3, asList(1, 3, 5), 3, asList(1, 2, 3, 4, 5, 6)},
                {asList(2, 4, 0, 0, 0), 2, asList(1, 3, 5), 3, asList(1, 2, 3, 4, 5)},
                {asList(2, 4, 6, 0, 0), 3, asList(1, 3), 2, asList(1, 2, 3, 4, 6)},
                {asList(1), 1, asList(), 0, asList(1)},
                {asList(0), 0, asList(1), 1, asList(1)}
        };
    }
}