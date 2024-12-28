package solution.array;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class RemoveElementUnitTest {

    private RemoveElement solution = new RemoveElement();

    @Test(dataProvider = "dataProvider")
    public void testRemoveElement(int[] nums, int val, int k) {
        assertThat(solution.removeElement(nums, val)).isEqualTo(k);
    }

    @Test(dataProvider = "dataProvider")
    public void testRemoveElementV1(int[] nums, int val, int k) {
        assertThat(solution.removeElementV1(nums, val)).isEqualTo(k);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {convertToIntArray(asList(3, 3)), 3, 0},
                {convertToIntArray(asList(3, 3, 3)), 3, 0},
                {convertToIntArray(asList(3, 4)), 3, 1},
                {convertToIntArray(asList(3, 4)), 4, 1},
                {convertToIntArray(asList(0, 1, 2, 2, 3, 0, 4, 2)), 2, 5},
                {convertToIntArray(asList(2, 2, 3, 4)), 2, 2},
                {convertToIntArray(asList(1, 2, 3, 4)), 2, 3},
                {convertToIntArray(asList(3, 2, 2, 3)), 3, 2}
        };
    }

    private int[] convertToIntArray(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}