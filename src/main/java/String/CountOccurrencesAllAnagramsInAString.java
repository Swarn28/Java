package String;


/*
 * https://algo.monster/liteproblems/438
 * https://www.youtube.com/watch?v=mrUBUWb23hk&list=PLpIkg8OmuX-J2Ivo9YdY7bRDstPPTVGvN -- this is a series look into them.
 *
 * */
public class CountOccurrencesAllAnagramsInAString {

    public static void main(String[] args) {
        //Counting the number of anagrams.
       int result = CountOccurrencesAllAnagramsInAString.search("ab","abab");

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

                //this formulae of 'j-i+1' , This comes from basic index math.
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
}
