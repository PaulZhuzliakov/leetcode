package leetcode.Arrays_And_Hashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int result = 1;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                result = Math.max(result, count);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = new LongestConsecutiveSequence().longestConsecutive(nums);
        System.out.println(result);
    }
}
