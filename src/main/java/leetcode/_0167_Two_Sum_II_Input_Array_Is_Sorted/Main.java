package leetcode._0167_Two_Sum_II_Input_Array_Is_Sorted;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9))); //Output: [1,2]
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointerA = 0;
        int pointerB = numbers.length-1;
        while(pointerB > pointerA) {
            if (numbers[pointerA] + numbers[pointerB] == target) {
                return new int[]{pointerA+1, pointerB+1};
            } else if (numbers[pointerA] + numbers[pointerB] > target) {
                pointerB--;
            } else {
                pointerA++;
            }
        }
        throw new IllegalArgumentException();
    }
}