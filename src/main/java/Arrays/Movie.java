package Arrays;

public class Movie implements Comparable<Movie> {

    String name;
    int startDate;
    int endDate;


    public Movie(String name, int startDate, int endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int compareTo(Movie otherMovie){
        return Integer.compare(this.endDate,otherMovie.endDate);
    }
}
