package Arrays;

import java.util.*;

public class ActivitySelection_Movies {

    public static void main(String[] args) {
        System.out.println("Hello..");
        int movieCount=0;
        int lastEnd=0;

        List<Movie> moviesList = Arrays.asList(
                new Movie("MN-1",1,7),
                new Movie("MN-2",5,6),
                new Movie("MN-3",9,11),
                new Movie("MN-4",9,12),
                new Movie("MN-5",9,13),
                new Movie("MN-6",9,14)
        );

        Collections.sort(moviesList);
        for(Movie m:moviesList){
            if(m.startDate>lastEnd){
                System.out.println("Selected Arrays.Movie: "+m.name);
                movieCount++;
                lastEnd = m.endDate;
            }
            else{
                moviesList.remove(m);
            }
        }
    }
}
