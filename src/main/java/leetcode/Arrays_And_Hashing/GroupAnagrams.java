package leetcode.Arrays_And_Hashing;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0) {
            return result;
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            int[] hash = new int[26];
            for (char c: s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = Arrays.toString(hash);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        result.addAll(map.values());
        return result;
    }


    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
    }
}
