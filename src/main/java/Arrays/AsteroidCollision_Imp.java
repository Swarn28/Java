package Arrays;
import java.util.Stack;


/*https://leetcode.com/problems/asteroid-collision/description/*/

public class AsteroidCollision_Imp {

    public static void main(String[] args) {
        int[] asteroids = {1, 2, 3, 4, -10};
        //10,2,-5
        //1
        Stack<Integer> stack = new Stack<>();

        for(int asteroid: asteroids){
            boolean destroyed = false;

            while(!stack.isEmpty() && stack.peek()>0 && asteroid<0){

                if(Math.abs(stack.peek()) > Math.abs(asteroid)){
                    destroyed = true;
                    break;
                }
                else if(Math.abs(stack.peek()) == Math.abs(asteroid)){
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else{
                    stack.pop();
                }

            }

            if(!destroyed){
                stack.push(asteroid);
            }
        }

        int[] outPutArr = stack.stream().mapToInt(i->i).toArray();

        for(int num: outPutArr){
            System.out.println(num);
        }
    }
}
