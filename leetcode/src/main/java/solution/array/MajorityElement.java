package solution.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    // the majority element is guaranteed to exist

    public int majorityElementV1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int key = 0;
        int max = 0;
        for (int num : nums) {
            if (!frequencyMap.containsKey(num)) {
                frequencyMap.put(num, 1);
            } else {
                int oldValue = frequencyMap.get(num);
                frequencyMap.replace(num, oldValue, ++oldValue);
                if (oldValue > max) {
                    max = oldValue;
                    key = num;
                }
                if (max > nums.length / 2) {
                    return key;
                }
            }
        }

        return key;
    }

    public int majorityElementV2(int[] nums) { // Boyer-Moor Voting algorithm
        if (nums.length == 1) {
            return nums[0];
        }

        int candidate = 0; // potential majority element
        int count = 0; // balance for the other elements
        for (int num : nums) {
            if (count == 0) { // if the counter is decreased to 0, choose new candidate
                candidate = num;
            }
            // use count as balance for the other elements (if the next element is the chosen candidate,
            // increase the counter, otherwise decrease
            count += (num == candidate) ? 1 : -1;
        }
        /*
        Verification if needed:
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > nums.length / 2) ? candidate : -1;
        */

        return candidate;
    }
}
