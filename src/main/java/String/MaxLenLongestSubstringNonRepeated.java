package String;

/*This is second way to find length of max non-repeated substring
* First way is to use maxTillNow and overallMax way. That code is also present in same folder.
*
* */

public class MaxLenLongestSubstringNonRepeated {

    public static void main(String[] args) {
        String s = "aabbcdefddgga";

        int left=0;
        int right=0;
        int maxLength=0;
        boolean[] visited = new boolean[256];

        while(right < s.length()) {

            while(visited[s.charAt(right)]){
                visited[s.charAt(left)] = false;
                left++;
            }

            visited[s.charAt(right)] = true;
            maxLength = Math.max(maxLength, right-left +1);
            right++;
        }
        System.out.println("Max length is: "+maxLength);
    }

}
