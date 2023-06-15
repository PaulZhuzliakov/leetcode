package leetcode.unsorted._0217_Contains_Duplicate;

public class Runner {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        boolean isContainsDuplicate = containsDuplicate.containsDuplicate(nums);
        System.out.println(isContainsDuplicate);
    }
}
