package leetcode.unsorted._1395_Count_Number_of_Teams;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] rating = {2, 5, 3, 4, 1};
        int result = new Solution_NxN().numTeams(rating);
        System.out.println(result);

    }
}