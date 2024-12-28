package solution.array;

/*
    27. Remove Element

    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k, to get accepted,
    you need to do the following things:
     - change the array nums such that the first k elements of nums contain the elements which are not equal to val.
     - the remaining elements of nums are not important as well as the size of nums.
    Return k.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        list.removeAll(List.of(val));
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }

    public int removeElementV1(int[] nums, int val) {
        if (nums.length == 1) {
            return val == nums[0] ? 0 : 1;
        }

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                while (nums[length - 1] == val && length > 1 && length != i) {
                    length--;
                }
                if (length == i) {
                    return length;
                }
                int aux = nums[i];
                nums[i] = nums[length - 1];
                nums[length - 1] = aux;
                length--;
            }
        }

        return length;
    }
}
