package String;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://algo.monster/liteproblems/438
 * https://www.youtube.com/watch?v=mrUBUWb23hk&list=PLpIkg8OmuX-J2Ivo9YdY7bRDstPPTVGvN -- this is a series look into them.
 *
 * */
public class AllAnagramsStartPosition {

    public static void main(String[] args) {
        String txt = "cbaebabacd";
        String pat = "abc";

        int[] counter = new int[26];
        Arrays.fill(counter,0);

        // Create a frequency array for pattern.
        for(int i=0; i<pat.length(); i++){
            char ch = txt.charAt(i);
            counter[ch-'a']++;
        }

        int i=0;
        int j=0;
        int n = txt.length();
        int k = pat.length();
        List<Integer> resultList = new ArrayList<>();

        while(j<n){
            counter[txt.charAt(j)-'a']--;

            if(j-i+1 == k){
                if(allZeroes(counter)){
                    resultList.add(i);
                }

                counter[txt.charAt(i)-'a']++;
                i++;
            }

            j++;
        }
        resultList.forEach(r -> System.out.println(r+" "));
    }

    public static boolean allZeroes(int[] counter){
        for(int num: counter){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
