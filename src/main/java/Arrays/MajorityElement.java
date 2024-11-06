package Arrays;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
* https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
*
* */
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int midSize = nums.length / 2;

        Map<Integer, Integer> countMap = new HashMap();

        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        int maxValue = 0;
        int maxNum = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxNum = entry.getKey();
            }
        }

        System.out.println(maxNum);
    }

}
