package leetcode._0003_Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));    //Output: 3
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));    //Output: 3
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();
        while (b_pointer < s.length()) {
            if (!set.contains(s.charAt(b_pointer))) {
                set.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
}
