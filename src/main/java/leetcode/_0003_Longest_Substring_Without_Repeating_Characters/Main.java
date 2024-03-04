package leetcode._0003_Longest_Substring_Without_Repeating_Characters;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));    //Output: 3
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));    //Output: 3

    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        int lengthTemp = 0;
        int lengthOfLongestSubstring = 0;
        Map<Character, Integer> indexByChar = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!indexByChar.containsKey(charArray[i])) {
                indexByChar.put(charArray[i], i);
                lengthTemp++;
            } else {
                if (lengthTemp > lengthOfLongestSubstring) {
                    lengthOfLongestSubstring = lengthTemp;
                }
                lengthTemp = 0;

                i=i-indexByChar.size();
                indexByChar.clear();
            }
        }
        return Math.max(lengthOfLongestSubstring, lengthTemp);
    }
}
