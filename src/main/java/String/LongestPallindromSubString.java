package String;

/*
* https://www.youtube.com/watch?v=n_kL8BkURVA&t=1292s
*
* */

public class LongestPallindromSubString {

    public static void main(String[] args) {
        String s = "aacabdkacaa";
        LongestPallindromSubString.findSubStringPallindrome(s);
    }

    public static boolean solve(String s, int i, int j,Boolean[][] memo ){

        char[] chars = s.toCharArray();
        if(i>=j){
            return true;
        }

        if(memo[i][j]!=null){
            return memo[i][j];
        }

        if(chars[i] == chars[j]){
            memo[i][j]=  solve(s,i+1, j-1,memo);
        } else{
            memo[i][j] = false;
        }

        return memo[i][j];
    }

    public static void findSubStringPallindrome(String s){

        int n = s.length();
        int maxLen = Integer.MIN_VALUE;
        int sp = 0;
        Boolean[][] memo = new Boolean[n][n];
        for(int i=0; i<s.length();i++){
            for(int j =i; j<s.length();j++){
                if(solve(s,i,j,memo)){
                    int len = j-i+1;

                    if(len>=maxLen){
                        maxLen = len;
                        sp=i;
                    }


                }
            }
        }

        System.out.println("longest Pallindrome substring is : " +s.substring(sp,sp+maxLen));

    }

}
