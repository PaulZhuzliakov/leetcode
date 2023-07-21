package leetcode.Arrays_And_Hashing;

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); //K - element; V - Quantity
        for (int number: nums) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());

        priorityQueue.addAll(map.entrySet());

        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = Objects.requireNonNull(priorityQueue.poll()).getKey();
        }

        return output;
    }

    public static void main(String[] args) {
        TopKFrequentElements solution = new TopKFrequentElements();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = solution.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }

}
