package String;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * https://algo.monster/liteproblems/438
 * https://www.youtube.com/watch?v=mrUBUWb23hk&list=PLpIkg8OmuX-J2Ivo9YdY7bRDstPPTVGvN -- this is a series look into them.
 *
 * */
public class AllAnagramsInAString {

    /*public static void main(String[] args) {
     String s = "cbaebabacdfgbca";
        String p = "abc";

        String s = "BACDGABCDA";
        String p = "ABCD";

      //  String s = "abab";
     //   String p = "ab";

        Map<Character, Integer> countMap = new HashMap<>();
        List<Integer> finalList = new ArrayList<>();
        List<Character> strList = new ArrayList<>();


        int lenP = p.length();
        int lenS = s.length();
        int count = 0;
        int prev = -1;


        for (int i = 0; i < lenP; i++) {
            strList.add(p.charAt(i));
        }

        for (int i = 0; i < lenS; i++) {
            char curr = s.charAt(i);
            boolean flag = false;
            if (strList.contains(curr)) {
                count++;
                if (prev == -1) {
                    prev = i;
                }

                if (!countMap.containsKey(curr)) {
                    countMap.put(curr, 1);
                } else {
                    countMap.put(curr, countMap.get(curr) + 1);
                }

                if (count == lenP) {

                    long count1 = countMap.entrySet().stream().filter(entry -> entry.getValue() == 1).count();
                    if (count1 == lenP) {
                        finalList.add(prev);
                        flag = true;
                    }
                    // If count is approved but the hashmap each character is more than one, then also reinitialize the map.
                    else{
                        countMap.clear();
                        count = 0;
                        prev = -1;
                        i--;
                    }

                }

                if (flag) {
                    countMap.clear();
                    count = 0;
                    prev = -1;
                }

            }
        }
        System.out.println("value is: ");
        finalList.forEach(System.out::println);
    }*/

    public static void main(String[] args) {
        //Counting the number of anagrams.
       int result = AllAnagramsInAString.search2("ab","abab");

        System.out.println("Result is : " +result);
    }

    public static int search(String pat, String txt){
            int n = txt.length();

            int[] counter = new int[26];

            for(int i=0; i<pat.length(); i++){
                char ch = pat.charAt(i);
                counter[ch-'a']++;
            }

            int i=0,j=0;
            int result =0;
            int k = pat.length();

            while(j < n){
                counter[txt.charAt(j) -'a']--;

                if(j - i + 1 == k){
                    if(allZero(counter)){
                        result++;
                    }
                    counter[txt.charAt(i) -'a']++;
                    i++;

                }
                j++;
            }

            return result;
    }

    public static boolean allZero(int[] counter){
        for(int i:counter){
            if(i!=0){
                return false;
            }
        }
        return true;
    }

    public static int search2(String pat, String txt){

        int n = txt.length();
        int[] counter = new int[26];

        for(int i=0;i<pat.length();i++){
            char ch = pat.charAt(i);
            counter[ch-'a']++;
        }

        int i=0, j=0, count =0;
        int patLen = pat.length();

        while(j<n){
            counter[txt.charAt(j) - 'a']--;

            if(j-i+1 == patLen){
                if(allZero2(counter)){
                    count++;
                }
                //Make current poistion of i as +1 in counter array. Then change the position of i to next char.
                counter[txt.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return count;
    }

    public static boolean allZero2(int[] counter){
        for(int i:counter){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
