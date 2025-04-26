package DP;


/*https://www.geeksforgeeks.org/find-the-minimum-cost-to-reach-a-destination-where-every-station-is-connected-in-one-direction/
*/

import java.util.Arrays;

public class ShortestTrainPath {

    public static void main(String[] args) {
        int cost[][] = {
                {0, 15, 80, 90},
                {-1, 0, 40, 50},
                {-1, -1, 0, 70},
                {-1, -1, -1, 0}
        };

        ShortestTrainPath.minAmount(cost);
    }

    public static void minAmount(int[][] cost) {

        int N = cost.length;
        int[] dist = new int[cost.length];
        Arrays.fill(dist, 9999);
        dist[0] = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (dist[j] > dist[i] + cost[i][j]) {
                    dist[j] = dist[i] + cost[i][j];
                }
            }
        }
        // because we need to find min. cost to reach last station, that is
        // why we are printing N-1 location.
        System.out.println("result: " + dist[N - 1]);

    }
}
