package solution.array;

import java.util.HashMap;

/*
    1. Two Sum

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
*/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        HashMap<Integer, Integer> complements = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            int currComplement = target - nums[i];
            if(complements.containsKey(nums[i])){
                result[0] = i;
                result[1] = complements.get(nums[i]);
                return result;
            }
            complements.put(currComplement, i);
        }
        return result;
    }
}