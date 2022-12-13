package leetcode._0118_Pascals_Triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            triangle.add(i, list);
            for (int j = 0; j <= i; j++) {
               if (j == 0 || j == i) {
                   triangle.get(i).add(1);
               } else if (i - 1 > 0){
                   triangle.get(i).add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
               }
            }
        }

        return triangle;
    }
}
