package leetcode.unsorted._0200_Number_of_Islands;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numOfIslands++;
                    fillIslandWithZeros(grid, i, j);
                }
            }
        }
        return numOfIslands;
    }

    private void fillIslandWithZeros(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        if (i + 1 < grid.length && grid[i + 1][j] == '1') {
            fillIslandWithZeros(grid, i + 1, j);    //up
        }
        if (i - 1 >= 0 && grid[i - 1][j] == '1') {
            fillIslandWithZeros(grid, i - 1, j);    //down
        }
        if (j - 1 >= 0 && grid[i][j - 1] == '1') {
            fillIslandWithZeros(grid, i, j - 1);    //left
        }
        if (j + 1 < grid[i].length && grid[i][j + 1] == '1') {
            fillIslandWithZeros(grid, i, j + 1);    //right
        }
    }

}
