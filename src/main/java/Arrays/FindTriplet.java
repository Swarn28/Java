package Arrays;

public class FindTriplet {

    /*
    * Given an array find 3 consecutive numbers which have max sum. Medium difficult.
    * ASked in Spice Money interview
    * */

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 1, 8, 20, 7, 1, 2, 4, 2, 25, 1, 3};
                //{1, 3, 6, 1, 8, 8, 7, 1, 2, 4, 2, 5, 1, 3};
        int[] maxTriplet = FindTriplet.findTriplet(arr);
        System.out.println("Triplet is: ");
        for(int num: maxTriplet){
            System.out.println(num);
        }
    }

    public static int[] findTriplet(int[] arr) {
        int[] triplets = new int[3];
        // 8,9,7
        int n = arr.length;
        int maxSum = arr[0] + arr[1] + arr[2];
        int[] maxTriplet = {arr[0], arr[1], arr[2]};
        int currSum = arr[0] + arr[1] + arr[2];
        for (int i = 3; i < arr.length; i++) {
            currSum = currSum - arr[i - 3] + arr[i - 2];
            if (currSum > maxSum) {
                maxSum = currSum;
                maxTriplet = new int[]{arr[i - 2], arr[i - 1], arr[i]};
            }
        }
        return maxTriplet;
    }
}
