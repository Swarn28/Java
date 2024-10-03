package DP;


/*
Count minimum number of coins reqd
* https://www.youtube.com/watch?v=-NTaXJ7BBXs&t=201s
* */
public class CoinProblemDP {

    public static void main(String[] args) {

        int sum = 10;
        int[] arr ={2,5,3,6};
        int[] dp = new int[sum+1];
        dp[0] = 0;

       //int count = CoinProblemDP.minCoinsNormal(sum,arr);
       int count = CoinProblemDP.minCoinsDP(sum,arr,dp);
        System.out.println("Count is: " +count);

    }

    public static int minCoinsDP(int sum, int[] arr, int[] dp){
        int minCoins = Integer.MAX_VALUE;

        if(sum ==0){
            return 0;
        }

        for(int i=0; i<arr.length; i++){
            int subSet=0;

            if(sum-arr[i] >=0){
                if(dp[sum-arr[i]] !=0){
                    subSet = dp[sum-arr[i]];
                }
                else{
                    subSet = minCoinsDP(sum-arr[i], arr, dp);
                }
            }

            if(subSet + 1 < minCoins){
                minCoins = subSet +1;
            }
        }
        dp[sum] = minCoins;
        return minCoins;
    }

    public static int minCoinsNormal(int sum,int[] arr){
        int minCoins = Integer.MAX_VALUE;
        if(sum ==0){
            return 0;
        }
        for(int i=0; i<arr.length; i++){
            int subSum = 0;
            if(sum - arr[i] >=0){
                subSum = minCoinsNormal(sum - arr[i], arr);
            }
            if(subSum + 1 < minCoins){
                minCoins = subSum +1;
            }
        }
        return minCoins;
    }
}
