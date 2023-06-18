package leetcode.Arrays_And_Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); //value,index
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

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int [] nums = {2,7,11,15};
        int  target = 9;
        int[] indeces = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(indeces));
    }
}
