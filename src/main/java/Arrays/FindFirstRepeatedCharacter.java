package Arrays;


/*
* Given a word you need to find the first repeated character in it.
* */
public class FindFirstRepeatedCharacter {

    public static void main(String[] args) {
        String word = "letter";
        char[] arrWord = new char[26];

        for(int i=0;i<word.length();i++){
            char currWord = word.charAt(i);
            if(arrWord[currWord - 'a']!=1) {
                arrWord[currWord - 'a'] = 1;
            }
            else{
                System.out.println("found " +currWord);
                break;
            }
        }
    }
}
