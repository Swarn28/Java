package Arrays;

public class FindTriplet {
    public static int maxSumOfThreeConsecutive(int[] arr) {
        // Array must have at least 3 elements
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array should have at least 3 elements.");
        }

        // Step 1: Calculate the sum of the first three elements
        int maxSum = arr[0] + arr[1] + arr[2];
        int currentSum = maxSum;
        int startIdx=0;
        // Step 2: Use sliding window to find maximum sum of 3 consecutive numbers
        for (int i = 3; i < arr.length; i++) {
            // Update the sum by subtracting the element that is left out
            // and adding the new element that enters the window
            currentSum = currentSum - arr[i - 3] + arr[i];

            // Update maxSum if the current sum is greater
           // maxSum = Math.max(maxSum, currentSum);
            if(maxSum<currentSum){
                maxSum = currentSum;
                startIdx = i-2;
            }
        }

        // Step 3: Return the maximum sum
        System.out.println("numbers are : " +arr[startIdx]+" "+arr[startIdx+1]+" "+arr[startIdx+2]);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 2, 7, 4, 1, 9, 51, 3, 6, 1, 8, 20, 7, 1, 2, 4, 2, 25, 1, 3};
        //{1, 2, 3, 6, 2, 7, 4, 1, 9, 5}
        int result = maxSumOfThreeConsecutive(arr);
        System.out.println("The maximum sum of three consecutive numbers is: " + result);
    }
}
