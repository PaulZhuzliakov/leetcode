package leetcode._0001_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{3, 2, 4}, 6)));
    }
}

class Solution {
    int [] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (indexByValue.containsKey(target - nums[i]))  {
                return new int[] {i, indexByValue.get(target - nums[i])};
            }
            indexByValue.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
}

