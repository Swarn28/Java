package String;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
 *
 * https://www.geeksforgeeks.org/largest-substring-with-same-characters/?ref=ml_lbp
 * Largest substring with same Characters

 * */
public class LongestSubstringRepeated {

    public static void main(String[] args) {

       // String s = "geeksforgeeks";
        String s = "aaaooobbbeeiioooouuu";

        HashMap<Character, Integer> charMap = new HashMap<>();
        Character prev = ' ';
        for(int i=0; i<s.length(); i++){
            if(i>0){
            prev = s.charAt(i-1);
            }
            Character curr = s.charAt(i);
            if(charMap.containsKey(curr)){
                if(i>0 && prev==curr){
                charMap.put(curr,charMap.get(curr)+1);
                }
                else{
                    charMap.put(curr,1);
                }
            }
            else{
                charMap.put(curr,1);
            }
        }
        Optional<Integer>overAllMaxCount = charMap.values().stream().
                max(Comparator.comparingInt(Integer::intValue));
        Character maxKey= ' ';
        //fetch key from value

        Optional<Map.Entry<Character, Integer>> first = charMap.entrySet().stream().
                filter(entry -> entry.getValue().equals(overAllMaxCount.get())).
                findFirst();

        maxKey = first.get().getKey();

        System.out.println("max substring is: ");

        for(int i=1;i<=overAllMaxCount.get(); i++){
            System.out.print(maxKey);
        }
    }
}
