package leetcode.Arrays_And_Hashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = createMap(s);
        Map<Character, Integer> map2 = createMap(t);

        return map1.equals(map2);
    }

    Map<Character, Integer> createMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            map.computeIfPresent(charAt, (character, integer) -> ++integer);
            map.putIfAbsent(charAt, 1);
        }
        return map;
    }


    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
//        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "cara"));
    }
}

