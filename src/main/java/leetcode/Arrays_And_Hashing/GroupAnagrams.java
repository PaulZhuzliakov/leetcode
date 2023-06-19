package leetcode.Arrays_And_Hashing;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String sortedStr = sortStringAlphabetically(str);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (isAnagram(str, entry.getKey())) {
                    map.get(entry.getKey()).add(str);
                }
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            result.add(entry.getValue() );
        }
        return result;
    }

    boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        int[] charsAsIntInString = new int[26];
        for (int i = 0; i < first.length(); i++) {
            charsAsIntInString[first.charAt(i) - 'a']++;
            charsAsIntInString[second.charAt(i) - 'a']--;
        }
        for (int i : charsAsIntInString) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    String sortStringAlphabetically(String unsorted) {
        char[] charArray = unsorted.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
    }
}
