package leetcode.Arrays_And_Hashing;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> setS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            setS.computeIfPresent(charAt, (character, integer) -> ++integer);
            setS.putIfAbsent(charAt, 1);
        }

        HashMap<Character, Integer> setT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char charAt = t.charAt(i);
            setT.computeIfPresent(charAt, (character, integer) -> ++integer);
            setT.putIfAbsent(charAt, 1);
        }

        return setS.equals(setT);
    }


    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
//        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "cara"));
    }
}

