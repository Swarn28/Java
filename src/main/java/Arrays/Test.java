package Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {1,0,4};

        int farthest =0;
        int currentEnd = 0;
        int jumps =0;

        for(int i=0; i<arr.length -1 ; i++){
            farthest = Math.max(farthest, i+arr[i]);
            if(i==currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }

        System.out.println(jumps);
    }



}
