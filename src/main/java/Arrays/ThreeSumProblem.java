package Arrays;
import java.util.Arrays;

public class ThreeSumProblem {

    /*
     *
     * https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
     *
     * */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 5};
        //{12, 3, 4, 1, 6, 9};
        Arrays.sort(arr);
        int sum = 9;


        for(int i=0;i<arr.length-2;i++){

            int l = i+1;
            int r = arr.length -1;

            while(l<r){
                int currSum = arr[i] + arr[l] + arr[r];

                if(currSum < sum){
                    l++;
                }

                else if(currSum > sum){
                    r--;
                }
                else if(currSum == sum){
                    System.out.println("Found Triplet..." +arr[i] +" " + arr[l] + " " + arr[r] );
                    break;
                }

            }

        }

    }
}
