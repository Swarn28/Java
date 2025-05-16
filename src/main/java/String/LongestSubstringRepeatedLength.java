package String;

/*
 *
 * https://www.geeksforgeeks.org/largest-substring-with-same-characters/?ref=ml_lbp
 * Largest substring with same Characters

 * */
public class LongestSubstringRepeatedLength {

    public static void main(String[] args) {

      //  String s = "geeeksforgeekkkks";
        String s = "aaaooobbbeeiioooooouuu";
        StringBuilder result= new StringBuilder();
       // String s = "abcde";
        /*HashMap<Character, Integer> charMap = new HashMap<>();
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
        }*/
        char maxChar=' ';
        int ans=0;
        int temp=1;
        int temp2=0; // for storing temp for 'ans' variable.

        for(int i =1;i<=s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i-1)){
                temp++;
            }
            else{
                ans = Math.max(ans,temp);
                if(temp2!=ans) {
                    maxChar = s.charAt(i - 1);
                    temp2=ans;
                }
                temp=1;
            }
        }
        ans = Math.max(ans,temp);
     //  ans = ans > 0 ? ans+1 : 0;
        System.out.println("Max length is: "+ans);
        for(int k=1;k<=ans;k++){
            result.append(maxChar);
        }

        System.out.println("longest repeated substring is: "+result);
    }
}
