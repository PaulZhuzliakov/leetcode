package leetcode.unsorted._2269_Find_the_K_Beauty_of_a_Number;

//https://leetcode.com/problems/find-the-k-beauty-of-a-number/
public class Solution {
    public int divisorSubstrings(int num, int k) {
        String string = String.valueOf(num);
        int kBuatyCounter = 0;
        int divisor;
        for (int i = 0; i < string.length() - k + 1; i++) {
            String substring = string.substring(i, i + k);
            divisor = Integer.parseInt(substring);
            if (divisor != 0 && num % divisor == 0) {
                kBuatyCounter++;
            }
        }
        return kBuatyCounter;
    }
}
