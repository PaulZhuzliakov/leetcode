package leetcode._0118_Pascals_Triangle;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> generate = pascalsTriangle.generate(5);
        System.out.println(generate);
    }
}
