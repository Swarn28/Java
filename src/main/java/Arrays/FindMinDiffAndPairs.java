package Arrays;

/*
* THis was asked in oracle first round. Given an array we need to find the min diff in
* them and then find the pairs having tha min difference.
* */

import java.util.Arrays;

public class FindMinDiffAndPairs {

    public static void main(String[] args) {
        int[] arr = {5,8,4,6,10,1};

        Arrays.sort(arr);

        int globalDiff=99999;
        int minDiffTillNow = 0;

        for(int i=1;i<arr.length;i++){
            minDiffTillNow = arr[i] - arr[i-1];

            if(globalDiff>minDiffTillNow){
                globalDiff = minDiffTillNow;
            }
        }

        System.out.println("Global Diff is : " +globalDiff);

        for(int i=1;i<arr.length;i++){
            if(arr[i] - arr[i-1] == globalDiff){
                System.out.println("Pair is: " +arr[i-1] + " " + arr[i]);
            }
        }
    }

}
