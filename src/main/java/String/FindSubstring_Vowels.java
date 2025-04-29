package String;


/*
 *
 * String s = "aaeeaaeeiioouuaeiuoouuiiaeiuo"
 *
 * vowels = a,e,i,o,u
 *
 *  Find longest substring, return length of longest substring.
 * Sequence should be maintained + all vowels should be present together
 *   https://www.youtube.com/results?search_query=leetcode+1839+problem+solution+java
 *   https://leetcode.com/problems/longest-substring-of-all-vowels-in-order/description/
 *
 * This is not complete
 * */

import java.util.*;

public class FindSubstring_Vowels {
    static Map<Character, Integer> countMap;

    public static void main(String[] args) {
        countMap = new HashMap<>();
        String word = "eiuoa";
        countMap.put('a',1);
        countMap.put('e',1);
        countMap.put('i',1);
        countMap.put('o',1);
        countMap.put('u',1);

        boolean result = validateBeautifulString(word);
        System.out.println("Result is : " +result);

    }

    public static boolean validateBeautifulString(String word){

        boolean isOnce = countAtleastOnce(word);
        boolean isSorted = followsVowelSequence(word);

       return isOnce && isSorted;
    }

    public static boolean followsVowelSequence(String str) {
        if (str.isEmpty()) return true; // ✅ Edge case: Empty string is valid
        if (str.length() == 1) return true; // ✅ Single vowel is always valid

        char[] vowels = {'a', 'e', 'i', 'o', 'u'}; // Ordered vowels
        int vowelIndex = 0; // Points to the required vowel in sequence

        for (char ch : str.toCharArray()) {
            if (ch == vowels[vowelIndex]) {
                continue; // ✅ Correct vowel, continue checking
            } else if (vowelIndex < vowels.length - 1 && ch == vowels[vowelIndex + 1]) {
                vowelIndex++; // ✅ Move to the next vowel in order
            } else {
                return false; // ❌
            }
        }
        return true;
    }

    private static boolean countAtleastOnce(String word) {

        for(int i=0;i<word.length();i++){
            char curr = word.charAt(i);

            if(countMap.containsKey(curr)){
                countMap.put(curr, countMap.get(curr)-1);
            }
        }

        if(countMap.containsValue(1)){
            return false;
        }else{
            return true;
        }

    }

}
