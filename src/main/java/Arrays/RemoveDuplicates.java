package Arrays;

import java.util.HashMap;
import java.util.HashSet;

/*
* https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
* */
public class RemoveDuplicates {

    public static void main(String[] args) {
       // int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,2,2, 3,3,4,5,5,5,6,7};
        int i=0,j=0,prev=0;

        prev = nums[0];

        int count =1;

        //We take two pointer one will move when different number is encoutered, other will check for duplicates
        // prev is also used to store the last number in array.
        for( j =0;j<nums.length;j++){

            if(nums[j] == prev){
                continue;
            }
            else{
                i++;
                swap(i, j, nums);
                prev = nums[i];
                count++;
              //  j++;
            }

        }

        System.out.println("count is : " + count);

    }

    public static void swap(int i, int j, int[] nums){
        int temp=0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
