package Arrays;

public class JumpGame2 {



    /*
    * You are given a 0-indexed array of integers nums of length n.
    * You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward
* jump from index i. In other words, if you are at nums[i],
* you can jump to any nums[i + j] where:

Input: nums = [2,3,1,1,4]
* {2,3,0,1,1,5}, {1,1,1,1,1,1}

Output: 2
    *
    * */
    public static void main(String[] args) {
        System.out.println("hello");
        int[] num = {2,0,0,0,1};
        int farthest =0;
        int currentEnd = 0;
        int jumps = 0;

        for(int i =0; i<num.length-1;i++){
            farthest = Math.max(farthest, i+num[i]);

            if(currentEnd<num.length){
                System.out.println("-1");
            }

            if(i==farthest){
                System.out.println("-1");
                break;
            }

            if(i == currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }
        System.out.println("Jumps are: "+jumps);
    }
}
