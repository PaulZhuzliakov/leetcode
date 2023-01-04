package leetcode._Two_Sum_II_Input_Array_Is_Sorted;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
        int target = 18;
        Solution solution = new Solution();
        int[] ints = solution.twoSum(numbers, target);
        System.out.println(Arrays.toString(ints));
    }
}
