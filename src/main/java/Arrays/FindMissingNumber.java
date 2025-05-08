package Arrays;

import java.util.ArrayList;
import java.util.List;


public class FindMissingNumber {

    public static void main(String[] args) {
        System.out.println("Hello...");
        int[] arr ={1,2,3,6,8,20};
        /*
        *   {1,2,3,6,8,9}
            output {4,5,7}
        * */

        List<Integer> missingNum = new ArrayList<>();
        int start = arr[0];
        int end = arr[arr.length-1];
        int idx =0;

        for(int num =start; num<=end;num++){

            if( idx < arr.length && arr[idx] == num){
                idx++;
            }
            else{
                missingNum.add(num);
            }
        }

        missingNum.forEach(System.out::println);
    }
}
