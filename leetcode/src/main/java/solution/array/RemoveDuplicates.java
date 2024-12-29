package solution.array;

/*
    26. Remove Duplicates from Sorted Array

    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
    each unique element appears only once. The relative order of the elements should be kept the same.
    Then return the number of unique elements in nums.

    Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
    - change the array nums such that the first k elements of nums contain the unique elements in the order
    they were present in nums initially. t
    - the remaining elements of nums are not important as well as the size of nums.

    Return k.
*/

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int index = 0;
        int pos = 0;
        while (index < nums.length - 1) {
            if (nums[index] == nums[index + 1]) {
                while (index < nums.length - 1 && nums[index] == nums[index + 1]) {
                    index++;
                }
                if (index < nums.length - 1) {
                    nums[++pos] = nums[index + 1];
                }
            } else {
                nums[++pos] = nums[index + 1];
            }
            index++;
        }

        return pos + 1;
    }

    public int removeDuplicatesV1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int pos = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[pos++] = nums[i];
            }
        }
        return pos;
    }
}
