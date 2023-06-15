package leetcode.unsorted._0167_Two_Sum_II_Input_Array_Is_Sorted;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftIndexPointer = 0;
        int rightIndexPointer = numbers.length - 1;

        int sum;
        do {
            sum = numbers[leftIndexPointer] + numbers[rightIndexPointer];
            if (sum > target) {
                rightIndexPointer--;
            } else if (sum < target) {
                leftIndexPointer++;
            }

        } while (sum != target);
        return new int[]{leftIndexPointer + 1, rightIndexPointer + 1};
    }
}
