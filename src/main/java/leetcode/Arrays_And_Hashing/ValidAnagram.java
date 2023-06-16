package leetcode.Arrays_And_Hashing;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int charNumber: charCount) {
            if (charNumber != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
//        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "cara"));
    }
}
