package Arrays;


/*
* https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
*
*
*
* */
public class SearchMinInSortedRotatedArray {

    public static void main(String[] args) {
        int[] arr = {11,13,15,17};
        int min = findMin(arr,0,arr.length-1);
        System.out.println("min is: "+min);

    }

    public static int findMin(int[] arr , int low, int high){
        int min = 99999;
        while(low<high){

            int mid = (low + high)/2;

            if(arr[mid] < min){
                min = arr[mid];
                break;
               // return min;
            }

            // look for sorted array.

            //left half is sorted
            if(arr[low] <= arr[mid]){
                if(arr[low] <= min){
                    min = arr[low];
                    low = mid+1;
                }
               /* else{
                    low = mid+1;
                }*/
            }

            else{
                // right half is sorted
                if(arr[low] <= min){
                    min = arr[low];
                    high = mid-1;
                }
               /* else{
                    low = mid+1;
                }*/
            }

        }
        return min;
    }
}
