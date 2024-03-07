package leetcode._0118_Pascals_Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().generate(5)); //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tringle = new ArrayList<>();

        if (numRows == 0) return tringle;

        List<Integer> first_row = new ArrayList<>();
        tringle.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = tringle.get(i - 1);
            List<Integer> curr_row = new ArrayList<>();

            curr_row.add(1);

            for (int j = 1; j < i; j++) {
                curr_row.add(prev_row.get(j - 1) + prev_row.get(j));
            }

            curr_row.add(1);
            tringle.add(curr_row);
        }

        return tringle;
    }
}