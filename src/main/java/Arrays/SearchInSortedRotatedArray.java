package Arrays;


/*
*
* https://takeuforward.org/data-structure/search-element-in-a-rotated-sorted-array/ (video answer)
* https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
*
* */
public class SearchInSortedRotatedArray {


    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int num = binarySearch(arr,0,arr.length-1,target);
        System.out.println("element pos is: " +num);
    }

    public static int binarySearch(int[] arr,int low, int high, int target) {

        while (low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                return mid;
            }

            // check left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    // number is in this half, eliminate right
                    high =mid - 1;
                } else {
                    low = mid+1;
                }
            }

            // check right half is sorted
            else {
                if (arr[high] >= target && target >= arr[mid]) {
                    //right half is sorted
                  low = mid+1;
                } else {
                   high = mid-1;
                }
            }

        }

        return -1;
    }

}
