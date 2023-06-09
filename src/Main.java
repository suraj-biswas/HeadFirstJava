import chapter_2_trip_to_objectville.Movie;

public class Main {
    // there has to be at least one main method for an application
    public static void main(String[] args) {
        int x; // uninitialized variable can't be used
//        System.out.println(x); // will give you an error
        Movie movie1 = new Movie() ;
        Movie movie2 = movie1;
    }
}