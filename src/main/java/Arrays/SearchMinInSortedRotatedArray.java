package Arrays;


/*
* https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
*
*https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
*
* */
public class SearchMinInSortedRotatedArray {

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int min = findMin(arr,0,arr.length-1);
        System.out.println("min is: "+min);

    }

    public static int findMin(int[] arr , int low, int high){
        int min = 99999;
        while(low<=high){

            int mid = (low + high)/2;

            if(arr[mid] < min){
                min = arr[mid];
               // return min;
            }

            // look for sorted array which side array is sorted.

            //left half is sorted
            if(arr[low] <= arr[mid]){
                if(arr[low] <= min){
                    min = arr[low];
                    // we looked into first sorted half, now look into other half, compare with it's low.
                    low = mid+1;
                }else{
                    low = mid+1;
                }
            }

            else{
                // right half is sorted
                if(arr[low] <= min){
                    min = arr[low];
                    high = mid-1;
                }
                else{
                    high = mid-1;
                }

            }

        }
        return min;
    }
}
