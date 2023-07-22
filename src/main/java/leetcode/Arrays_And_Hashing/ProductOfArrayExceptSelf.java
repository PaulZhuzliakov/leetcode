package leetcode.Arrays_And_Hashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] toLeft = new int[n];
        int[] toRight = new int[n];
        int[] output = new int[n];

        toRight[0] = 1;
        for (int i = 1; i < n; i++) {
            toRight[i] = toRight[i - 1] * nums[i - 1];
        }

        toLeft[n - 1] = 1;
        for (int i = n - 2; i >=0; i--) {
            toLeft[i] = toLeft[i +1] * nums[i +1];
        }

        for (int i = 0; i < n; i++) {
            output[i] = toLeft[i] * toRight[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = new ProductOfArrayExceptSelf().productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

}
