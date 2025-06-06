package String;

/*
 *
 * https://www.geeksforgeeks.org/largest-substring-with-same-characters/?ref=ml_lbp
 * Largest substring with same Characters

 * */
public class LongestSubstringRepeatedLength {

    public static void main(String[] args) {

      //  String s = "geeeksforgeekkkks";
        String s = "aaaooobbbeeiioooooouuu";
        StringBuilder result= new StringBuilder();

        char maxChar=' ';
        int ans=0;
        int temp=1;
        int temp2=0; // for storing temp for 'ans' variable.
        // temp2 is used if we want to print the substring also, for length only it is not required.

        for(int i =1;i<=s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i-1)){
                temp++;
            }
            else{
                ans = Math.max(ans,temp);
                if(temp2!=ans) {
                    maxChar = s.charAt(i - 1);
                    temp2=ans;
                }
                temp=1;
            }
        }
        ans = Math.max(ans,temp);
     //  ans = ans > 0 ? ans+1 : 0;
        System.out.println("Max length is: "+ans);

        // All this code is reqd if we want to print the substring also, otherwise not required.
        for(int k=1;k<=ans;k++){
            result.append(maxChar);
        }

        System.out.println("longest repeated substring is: "+result);
    }
}
