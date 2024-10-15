package Arrays;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
* Such that 2 repetitions are allowed.
* https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
* */
public class RemoveDuplicates2 {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,3,3};
        HashMap<Integer, Integer> countsMap = new HashMap<>();
        int k=0;
        for(int i =0;i<arr.length;i++){
            if(countsMap.containsKey(arr[i])){
                countsMap.put(arr[i], countsMap.get(arr[i])+1);
            }
            else{
                countsMap.put(arr[i],1);
            }

            if(countsMap.containsKey(arr[i]) && countsMap.get(arr[i])<=2){
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println("k is: " +k);
    }
}
