package leetcode._01_Arrays_And_Hashing;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        Contains_Duplicate solution = new Contains_Duplicate();
        boolean result = solution.containsDuplicate(new int[]{1, 2, 3, 4, 4});
        System.out.println(result);
    }
}
