package Arrays;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* https://www.youtube.com/watch?v=s4pN9Qfj8EY
* https://leetcode.com/problems/brick-wall/description/
* Medium Level
* */
public class WallBrick {


    public static void main(String[] args) {
        List<List<Integer>> wallList = new ArrayList<>();
        List<Integer> rowBricks1 = List.of(1,2,2,1);
        List<Integer> rowBricks2 = List.of(3,1,2);
        List<Integer> rowBricks3 = List.of(1,3,2);
        List<Integer> rowBricks4 = List.of(2,4);
        List<Integer> rowBricks5 = List.of(3,1,2);
        List<Integer> rowBricks6 = List.of(1,3,1,1);

        wallList.add(rowBricks1);
        wallList.add(rowBricks2);
        wallList.add(rowBricks3);
        wallList.add(rowBricks4);
        wallList.add(rowBricks5);
        wallList.add(rowBricks6);

        int touched = WallBrick.leastBricks(wallList);

        System.out.println("Result is: " +touched);
    }

    public static int leastBricks(List<List<Integer>> wall){

        int untouched =0 ;
        Map<Integer, Integer> map = new HashMap<>();

        for(List<Integer> row: wall){
            int end = 0;

            for(int brick=0; brick<row.size()-1; brick++){
                end += row.get(brick);
                if(!map.containsKey(end)){
                    map.put(end,1);
                }
                else{
                    map.put(end, map.get(end)+1);
                }
                untouched = Math.max(untouched, map.get(end));
            }
        }

        return wall.size() - untouched;
    }

}
