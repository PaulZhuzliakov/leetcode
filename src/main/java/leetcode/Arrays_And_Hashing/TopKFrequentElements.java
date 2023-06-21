package leetcode.Arrays_And_Hashing;

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();    //element,quantity

        for (int i: nums) {
            map.putIfAbsent(i, 0);
            map.computeIfPresent(i, (key, value) -> ++value);
        }

        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    public static void main(String[] args) {
        TopKFrequentElements solution = new TopKFrequentElements();
        int[] nums = {-1, -1};
//        int[] nums = {1,1,1,2,2,3};
        int k = 1;
        int[] result = solution.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }

}
