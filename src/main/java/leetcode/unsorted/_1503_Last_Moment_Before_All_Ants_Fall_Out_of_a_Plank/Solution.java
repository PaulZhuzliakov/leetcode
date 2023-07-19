package leetcode.unsorted._1503_Last_Moment_Before_All_Ants_Fall_Out_of_a_Plank;

import java.util.Arrays;

public class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int leftMax = left.length > 0 ? Arrays.stream(left).max().getAsInt() : 0;
        int rightMin = right.length > 0 ? Arrays.stream(right).min().getAsInt() : n;
        return Math.max(n - rightMin, leftMax);
    }
}

class Runner {
    public static void main(String[] args) {
        int[] left = {4,3};
        int[] right = {0,1};
        int lastMoment = new Solution().getLastMoment(4, left, right);
        System.out.println(lastMoment);
    }
}
