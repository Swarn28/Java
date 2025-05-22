package Arrays;

import java.util.HashMap;
/*https://chatgpt.com/share/682ea9be-cefc-8009-b4d6-f87ddd53b983*/
public class SubSliceArrayDistinct {

    public static void main(String[] args) {
        int[] num = {1, 2, 1, 3, 4, 2, 3};

        int start = 0;
        int end =0;
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int maxLen=0;

        for(end=0; end<num.length; end++){
            //We don't "decide" which element to reduce — we reduce whatever is at nums[start]
            numMap.put(num[end], numMap.getOrDefault(num[end],0)+1 );

            while(numMap.size()>2){
                numMap.put(num[start],numMap.get(num[start])-1);
                if(numMap.get(num[start])==0){
                    numMap.remove(num[start]);
                }
                start++;
            }

            maxLen = Math.max(maxLen, end-start+1);
        }

        System.out.println("MaxLen is: "+maxLen);
    }
}
