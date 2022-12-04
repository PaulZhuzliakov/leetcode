package leetcode._1395_Count_Number_of_Teams;

//https://leetcode.com/problems/count-number-of-teams/
public class Solution_NxN {

    public int numTeams(int[] rating) {
        int result = 0;
        for (int i = 0; i < rating.length; i++) {
            int leftLesser = 0, rightLesser = 0;
            int leftGreater = 0, rightGreater = 0;
            for (int j = 0; j < rating.length; j++) {
                if (j > i) {
                    if (rating[j] > rating[i]) {
                        rightGreater++;
                    } else {
                        rightLesser++;
                    }
                }
                if (j < i) {
                    if (rating[j] > rating[i]) {
                        leftGreater++;
                    } else {
                        leftLesser++;
                    }
                }
            }
            result += leftLesser * rightGreater + leftGreater * rightLesser;
        }
        return result;
    }
}



