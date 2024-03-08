package leetcode._0217_Contains_Duplicate;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {    //Output: true
        System.out.println(new Solution().containsDuplicate(new int[] {1,2,3,1}));
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}