package chapter01;

public class Exercise10 {
    public static void main(String[] args) {
        double distance_km = 14;
        double distance_miles = distance_km / 1.6;
        double time_seconds = 45 * 60 + 30;
        double time_hrs = time_seconds / 3600.0;
        System.out.println("Speed is " + distance_miles / time_hrs + " miles per hour");
    }
}
