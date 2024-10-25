package String;


import java.util.Arrays;

/*
*
* https://www.geeksforgeeks.org/longest-common-prefix-using-sorting/
*
* Input: strs[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
    Output: gee
*
* */
public class LongestCommonPrefix{

    public static void main(String[] args) {
        String[] str = {"geeksforgeeks","geeks","geek","geezer"};

      //  String[] str = {"flower","flow","flew","flock"};

       // String[] str = {"abbc","aabcbcd","acdsgbcds"};

        LongestCommonPrefix.longestCommon(str);
    }

    public static void longestCommon(String[] arr){

        Arrays.sort(arr);

        String s1 = arr[0];

        String s2 = arr[arr.length-1];

        int count=0;

        int minLength
                = Math.min(s1.length(), s2.length());

        while (count < minLength
                && s1.charAt(count) == s2.charAt(count)) {
            count++;
        }
        //We are using while loop because we want it to happen continuously(we want words which are together)
        // and not resume after sometime.Anything we want to happen again till the time it breaks we use while loop.

        System.out.println("Longest common is : " +s1.substring(0,count));

    }

}
