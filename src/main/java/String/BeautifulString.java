package String;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Str s= "saaietweoz"
 * o/p -> stweoz
 *
 * Str s = saaietweoziieet
 * o/p -> stweozt
 *
 * Remove if more than 3 vowels come.
 *
 * */
public class BeautifulString {
    static List<Character> vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        // String str = "aaeeolliioouu";
        //String str = "saaietweozt";
        // String str = "saaietweoziieet";
        String str = "aaeetiioa";
        int prev = -1;
        int count = 0;
        List<Integer> eliminateList = new ArrayList<>();
        boolean found = false;
        int i = 0;
        StringBuilder output = new StringBuilder();

        for (i = 0; i < str.length(); i++) {
            Character curr = str.charAt(i);
            if (isVowel(curr)) {
                if (prev == -1) {
                    prev = i;
                }
                count++;
                if (count > 3) {
                    // THis will only be triggered when last element is a vowel.
                    if (i == str.length() - 1) {
                        for (int k = prev; k <= i; k++) {
                            eliminateList.add(k);
                        }
                    }
                    found = true;
                }
            } else {
                if (found) {
                    for (int k = prev; k < i; k++) {
                        eliminateList.add(k);
                    }
                }
                if (count > 0) {
                    count = 0;
                    prev = -1;
                    found = false;
                }
            }
        }
        System.out.println("Eliminate list is: ");
        eliminateList.forEach(System.out::print);

        for (int l = 0; l < str.length(); l++) {
            if (!eliminateList.contains(l)) {
                output.append(str.charAt(l));
            }
        }
        System.out.println("Final beautiful string is: " + output);
    }
    public static boolean isVowel(Character c) {
        return vowelList.contains(c);
    }
}
