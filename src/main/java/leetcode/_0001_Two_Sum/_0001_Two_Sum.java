package leetcode._0001_Two_Sum;

import java.util.HashMap;
import java.util.NoSuchElementException;

//Given an array of integers [nums] and an integer [target], return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
public class _0001_Two_Sum {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 3, 0, 8, 12}, 12);
        System.out.println(ints[0] + " + " + ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); //value, order
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            int secondElem = target - nums[i];
            if (map.containsKey(secondElem)) {
                return new int[]{i, map.get(secondElem)};
            }
        }
        throw new NoSuchElementException("no element in array");
    }

}
