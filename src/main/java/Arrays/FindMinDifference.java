package Arrays;
import java.util.Arrays;

public class FindMinDifference {

    /*
    * https://www.geeksforgeeks.org/find-all-pairs-in-an-array-in-sorted-order-with-minimum-absolute-difference/
    * */

    public static void main(String[] args) {
        int [] arr = {6,1,4,10,5,8};
        Arrays.sort(arr);
        int minDiff = 9999;
        int globalDiff = 9999;
        int startIdx=0;
        int endIdx=9999;

        for(int i=1;i<arr.length;i++){
            minDiff = arr[i] - arr[i-1];

            if(globalDiff>minDiff){
                globalDiff = minDiff;
                endIdx = i;
                startIdx = i-1;
            }

            if(minDiff<0){
                minDiff = 0;
            }

        }
        System.out.println("min diff is: " +globalDiff);
        System.out.println("indexes are: " +startIdx + "," + endIdx);

        findMaxDiff(arr);
    }

    public static void findMaxDiff(int[] arr){
        Arrays.sort(arr);

        // after sorting it will be between first and last element.
        int maxDiff = arr[arr.length -1] - arr[0];
        System.out.println("maxDiff is : " + maxDiff);
    }
}
