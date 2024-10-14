package BackTracking;


import java.util.ArrayList;
import java.util.List;

/*
 * https://www.youtube.com/watch?v=yFfv03AE_vA
 * https://leetcode.com/problems/combination-sum/description/
 * https://www.geeksforgeeks.org/ways-to-sum-to-n-using-natural-numbers-up-to-k-with-repetitions-allowed/
 * Medium
 *
 * if given Sum=8 and k=2. then it means you have an array of [1,2] and using that you need to return the ways
 * by which you can get 8 as sum using [1,2] like [1,1,1,1,1,1,1] , [2,2,1,1,1,1] etc...
 * we need to find all such sets.
 *
 * The start index plays a crucial role in:
Ensuring that each combination is built in ascending order.
Preventing backward selections that would create duplicate combinations in different orders.
 * */
public class NSumProblem {

    public static void main(String[] args) {
        System.out.println(combinations());
    }

    public static List<List<Integer>> combinations(){
        int target = 8;
        int[] candidates = {1,2};
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> subsetList = new ArrayList<>();
        backTrack2(target,0,candidates,results,subsetList);
        return results;
    }

    //Self Practice...
    public static void backTracking(int target, int start, int[] candidates,
                                    List<List<Integer>> results, List<Integer> subsetList){

        if(target <0){
            return;
        }
        if(target == 0){
            results.add(new ArrayList(subsetList));
        }
        for(int i= start; i<candidates.length; i++){
            subsetList.add(candidates[i]);
            int newTarget = target - candidates[i];
            backTracking(newTarget,i,candidates,results,subsetList);
            subsetList.remove(subsetList.size()-1);
        }

    }


    public static void backTrack2(int target, int start, int[] candidates,
                                  List<List<Integer>> results, List<Integer> subList){

        if(target<0){
            return;
        }

        if(target == 0){
            results.add(new ArrayList<>(subList));
        }

        for(int i=start; i<candidates.length;i++){
            subList.add(candidates[i]);
            int newTarget = target - candidates[i];
            backTracking(newTarget, i, candidates, results,subList);
            subList.remove(subList.size()-1);
        }


    }



}
