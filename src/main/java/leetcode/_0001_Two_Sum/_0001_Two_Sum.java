package leetcode._0001_Two_Sum;

import java.util.HashMap;

//Given an array of integers [nums] and an integer [target], return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
public class _0001_Two_Sum {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 3, 0, 8, 12}, 5);
        System.out.println(ints[0] + " + " + ints[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();        //value, order
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}
