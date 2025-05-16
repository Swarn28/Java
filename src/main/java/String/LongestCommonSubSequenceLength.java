package String;


import java.util.Arrays;

/*This is a DP problem.
* https://leetcode.com/problems/longest-common-subsequence/description/
* https://www.youtube.com/watch?v=aJNu_DLyOxY
*
* */
public class LongestCommonSubSequenceLength {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int m = s1.length();
        int n = s2.length();
        int i=0;
        int j=0;
        int[][] temp = new int[m+1][n+1];
        for(int k =0; k<= m; k++) {
            Arrays.fill(temp[k], 0);
        }
       int length = LongestCommonSubSequenceLength.solve(s1,s2,i,j,temp,m,n);

        System.out.println("Length is : " +length);
    }

    // top-down recursive approach
    /*
    public static int solve(String s1,String s2, int i, int j,int[][] temp,int m,int n){

        if(i>=m || j>=n){
            return 0;
        }

        if(temp[i][j]!=-1){
            return temp[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j)){
             temp[i][j] = 1 + solve(s1,s2,i+1,j+1,temp,m,n);
             return temp[i][j];
        }

        else {
            return Math.max(solve(s1, s2, i + 1, j, temp, m, n),
                    solve(s1, s2, i, j + 1, temp, m, n));
        }

    }*/

    // TODO: bottom-up iterative approach. Leetcode approves this only, and not the recursive approach.
    /*TODO: we use for loops starting with 1 because in the temp array which is a 2d array, all the indcies where we have
    * even a single 0 in i or j, that inidci should be 0 be defaut. Because among two string in one os string is 0 or empty then we
    * return result as 0.
    * */
    public static int solve(String s1,String s2, int is, int js,int[][] temp,int m,int n){

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    temp[i][j] = 1 + temp[i - 1][j - 1];
                } else {
                    temp[i][j] = Math.max(temp[i - 1][j], temp[i][j - 1]);
                }
            }
        }

        return temp[m][n];

    }
}
