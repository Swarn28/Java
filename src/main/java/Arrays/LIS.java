package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
*
*  This is incorrect. learn this
* https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/#using-memoization
*
* */


public class LIS {

    public static void main(String[] args){
        int[] arr =  {3, 10, 2, 1, 20}; // Example input array

        List<Integer> outArr = new ArrayList<>();
        int prev = Integer.MIN_VALUE; // Initialize 'prev' to the smallest possible value

        for (int i = 0; i < arr.length; i++) {

            // Check if we are at the last element
            if (i == arr.length - 1) {
                if (arr[i] > prev) {
                    outArr.add(arr[i]);
                }
            }
            // Check if the current element is less than the next one
            else if (arr[i] < arr[i + 1]) {
                if ( arr[i + 2] < arr[i + 1]) {
                    outArr.add(arr[i]);
                    prev = arr[i];
                }
            }

            if (arr[i] > prev && i!=0 && i!=arr.length-1) {
                    outArr.add(arr[i]);
                    prev = arr[i];
                }
        }

        // Print the output array
        System.out.println(outArr);
    }
}
