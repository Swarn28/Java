package Arrays;

/*Find subarray with max sum from a given array. Return the max sum*/
public class FindMaxSubarray {

    public static void main(String[] args) {
        int [] arr1 = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxTillNow = 0 ;
        int overAllMax = Integer.MIN_VALUE;
        int start=0;
        int end =0;

        int size = arr1.length;

        for(int i=0;i< size; i++){
            maxTillNow = maxTillNow + arr1[i];
            if(overAllMax < maxTillNow){
                overAllMax = maxTillNow;
                end =i;
            }
            if(maxTillNow < 0){
                maxTillNow =0;
                start = i+1;
            }
        }

        System.out.println("Max sum of contigous subArray is: " +overAllMax);
        System.out.println("End is: "+end);
        System.out.println("Start is: "+start);

        /*for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + arr1[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        System.out.println("Max sum of contigous subArray is: " +max_so_far);*/

    }
}
