package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


/*
*
* https://www.geeksforgeeks.org/minimum-distance-between-any-most-frequent-and-least-frequent-element-of-an-array/
*
* */

public class FindMinDiffBwMostAndLeastOccuringNum {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 3, 4};
        //{2,5,3,19,5,8,2,5}
        //{1, 3, 4, 4, 3, 4}

        Map<Integer, Integer> numMap = new HashMap<>();

        Set<Integer> leastNums = new HashSet<>();
        Set<Integer> mostNums = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(numMap.containsKey(arr[i])){
                numMap.put(arr[i],numMap.get(arr[i])+1);
            }
            else{
                numMap.put(arr[i],1);
            }
        }

        Integer leastCount = numMap.values().stream().min(Integer::compareTo).get();

        Integer mostCount = numMap.values().stream().max(Integer::compareTo).get();

        leastNums = numMap.entrySet().stream().
                filter(entry -> entry.getValue() == leastCount).
                map(entry -> entry.getKey()).collect(Collectors.toSet());

        mostNums = numMap.entrySet().stream().
                    filter(entry -> entry.getValue() == mostCount).
                map(entry -> entry.getKey()).collect(Collectors.toSet());

        System.out.println("Done Partial...");

        int min_distance = Integer.MAX_VALUE;

        int last_min_found = -1;

        // Traverse array from start to end and find min difference.
        for(int i=0 ;i<arr.length;i++){

            if(leastNums.contains(arr[i])){
                last_min_found = i;
            }

            if(mostNums.contains(arr[i]) && last_min_found !=-1){
                min_distance = Math.min(min_distance, i-last_min_found);
            }

        }

        last_min_found = -1;
        //Traverse from last to start.

        for(int i = arr.length-1; i>=0; i--){

            if(leastNums.contains(arr[i])){
                last_min_found = i;
            }

            if(mostNums.contains(arr[i]) && last_min_found!=-1){
                min_distance = Math.min(min_distance, last_min_found -i);
            }
        }

        System.out.println("Min Distance is: " +min_distance);

    }
}
