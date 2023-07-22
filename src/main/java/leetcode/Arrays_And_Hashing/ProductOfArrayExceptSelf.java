package leetcode.Arrays_And_Hashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] output = new int[n];
        output[0]=1;

        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        int r = 1;
        for (int i = n - 1; i >=0; i--) {
            output[i] = output[i] *r;
            r = r * nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        int[] nums = {1, 1, 2, 6};
        int[] result = new ProductOfArrayExceptSelf().productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

}
