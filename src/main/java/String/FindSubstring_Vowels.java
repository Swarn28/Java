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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSubstring_Vowels {

    public static void main(String[] args) {
        String s = "aaeeaaeeiioouuaeiuoouuiiaeiuo";
        String vowels = "aeiou";
        int count = 0;

        char[] s_Char = s.toCharArray();
        char[] vowels_char = vowels.toCharArray();

        List<Integer> a_pos = new ArrayList<>();

        // Store the positions of 'a'.
        for (int i = 0; i < s_Char.length; i++) {
            if (s_Char[i] == 'a') {
                a_pos.add(i);
            }
        }

        Set<Character> viewedSet = new HashSet<>();
        int i = 0;
        char prev = 'a';
        for (int pos : a_pos) {
            count = 0;
            for (int j = pos, k = 0; j < s_Char.length & k < vowels_char.length; j++) {

                if (s_Char[j] == vowels_char[k] || s_Char[j] == vowels_char[k + 1]) {
                    count++;
                }
                if (prev != s_Char[j]) {
                    k++;
                }

                prev = s_Char[j];

           /* if(viewedSet.contains(s_Char[pos]) && s_Char[pos]!='a'){
                viewedSet.add(s_Char[k-1]);
            }
            if(s_Char[pos] == vowels_char[i] || s_Char[pos] == vowels_char[i+1] ){
                viewedSet.add(s_Char[pos]);
                count++;
                k++;*/
            }
            //  }
        }


    }

}
