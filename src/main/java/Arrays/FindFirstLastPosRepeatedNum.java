package Arrays;

import java.util.HashMap;

public class FindFirstLastPosRepeatedNum {

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,5,5,6,7,45,4};

        HashMap<Integer, Integer> dupMap = new HashMap<>();
        int repeatedNum = 0;
        int firstPos = -1, lastPos = 0;

        if(arr.length ==0 || arr.length == 1){
            System.out.println("Array is empty/contains 1 digit only...");
            return;
        }

        for(int i=0;i<arr.length;i++){
            if( dupMap.containsKey(arr[i])){
                dupMap.put(arr[i],dupMap.get(arr[i])+1);
                repeatedNum = arr[i];
                System.out.println("Repeated number is : " +repeatedNum);
                break;
            }
            else{
               dupMap.put(arr[i],1);
            }
        }

        for(int i=0;i<arr.length;i++){

            if(arr[i] == repeatedNum && firstPos <0){
                firstPos = i;
            }
            else if(arr[i] == repeatedNum && firstPos >= 0){
                lastPos = i;
            }
        }

        if(lastPos > 0 && firstPos != -1){
            System.out.println("Repeated number is: "+ repeatedNum +" ,positions are: " +firstPos +" "+lastPos );
        }
        else{
            System.out.println("No repeating numbers...");
        }
    }
}
