package Arrays;


/*
* https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/?ref=ml_lbp#expected-approach-one-traversal-solution-on-time-and-o1-space
* Solution -> This takes one traversal only, find the min in the array.
* For each minimum calculate the difference with each array element.
*   If the difference increases replace the result.(GeeksForGeeks way)
*
*
* */

public class BuySell1TransactionAllowed {
    public static void main(String[] args) {
       // int[] arr = {7, 10, 3, 3, 6, 9, 2};
        int[] arr = {1,5,2,10};
        int minNum = 999999;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }

            if (arr[i] - minNum > result) {
                result = arr[i] - minNum;
            }

        }
       System.out.println("result is: " + result);
    }
    }

