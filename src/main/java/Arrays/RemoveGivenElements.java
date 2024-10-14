package Arrays;


/*
* https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
*
* THis is very confusing question.
* WE need to move the non-equal elements to the start of the array, and return their count.
* */
public class RemoveGivenElements {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println("Count of non "+val+" is: " +k);
    }
}
