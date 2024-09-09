package Arrays;


/*
* https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/?ref=ml_lbp#expected-approach-one-traversal-solution-on-time-and-o1-space
*
* Solution 1 -> In one traversal find the minimum number in the array. Also keep track of the position of the minimum number found.
*   In the second traversal find the max number from the position of the minimum number. In this way you get the min and max in the array.
*   Subtract min and max.(my way)
*
* Solution 2 -> This takes one traversal only, find the min in the array. For each minimum calculate the difference with each array element.
*   If the difference increases replace the result.(GeeksForGeeks way)
*
*
* */

public class BuySell1TransactionAllowed {
    public static void main(String[] args) {
        int[] arr = {7, 10, 1, 3, 6, 9, 2};
        int minNum = 999999;
        int maxNum = 0;
        int position = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
                position = i;
            }

            //solution2 part
            if (arr[i] - minNum > result) {
                result = arr[i] - minNum;
            }


        }
        System.out.println("result is: " + result);
        /*for(int i =position; i< arr.length; i++){
            if(arr[i]>maxNum){
                maxNum = arr[i];
            }
        }

        System.out.println("Profit is: " + (maxNum - minNum));
    }*/
    }
}
