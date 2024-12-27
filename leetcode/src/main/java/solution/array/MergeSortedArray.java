package solution.array;

/*
    88. Merge Sorted Array

    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
    representing the number of elements in nums1 and nums2 respectively.

    Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that
    should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        if (nums2[0] >= nums1[m - 1]) {
            if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
            return;
        }
        while (n > 0 && m > 0) {
            if (nums2[n - 1] > nums1[m - 1]) {
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            } else if (nums2[n - 1] == nums1[m - 1]) {
                nums1[m] = nums2[n - 1];
                m++;
                n--;
            } else { // nums2[n-1] < nums1[m-1]
                nums1[m+n-1] = nums1[m-1];
                m--;
            }
        }
        if (n > 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        }
    }

    public void mergeV1(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
            return;
        }
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }
}
