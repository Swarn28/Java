package String;// Java program to find
// and print longest substring
// without repeating characters.
// Sliding window solution at
// https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/#consider-all-substrings-and-check-using-window-sliding-on2-time
import java.util.*;
class LongestSubstringNonRepeated
{

    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";

        HashSet<Character> strSet = new HashSet<>();

        StringBuilder maxTillNow = new StringBuilder();
        StringBuilder overallMax = new StringBuilder();

        for(int i= 0; i< s.length(); i++){

            if(!strSet.contains(s.charAt(i))){
                strSet.add(s.charAt(i));

                maxTillNow = maxTillNow.append(s.charAt(i));

                if(overallMax.length() <maxTillNow.length()){
                    overallMax = maxTillNow;
                }
            }
            else{

                strSet = new HashSet<>();
                maxTillNow = new StringBuilder("");
            }

        }

        System.out.println("Max is substring is : " +overallMax);
        System.out.println("Max substring len is: " +overallMax.length());
    }


}
