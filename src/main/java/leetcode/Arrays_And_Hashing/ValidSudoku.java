package leetcode.Arrays_And_Hashing;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character> nums = new HashSet<>();

        for (char[] line : board) {
            nums.clear();
            for (char c : line) {
                if (!nums.add(c) && c != '.') return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            nums.clear();
            for (int j = 0; j < 9; j++) {
                if (!nums.add(board[j][i]) && board[j][i] != '.') return false;
            }
        }

        for (int y = 0; y < 9; y = y + 3) {
            for (int x = 0; x < 9; x = x + 3) {

                nums.clear();
                for (int y1 = 0; y1 < 3; y1++) {
                    for (int x1 = 0; x1 < 3; x1++) {
                        char c = board[x + x1][y + y1];
                        if (!nums.add(c) && c != '.') return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
//        char[][] board = {
//                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
//                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
//                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
//                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
//                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
//                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
//                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
//        };

        boolean result = new ValidSudoku().isValidSudoku(board);
        System.out.println(result);
    }
}
