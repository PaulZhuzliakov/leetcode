package leetcode._0200_Number_of_Islands;

public class Runner {
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int islands = numberOfIslands.numIslands(grid);
        System.out.println(islands);
    }
}
