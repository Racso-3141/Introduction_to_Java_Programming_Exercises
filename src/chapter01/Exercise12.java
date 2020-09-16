package chapter01;

public class Exercise12 {
    public static void main(String[] args) {
        double distance_miles = 24;
        double distance_km = distance_miles * 1.6;
        double time_hrs = 1 + 40.0 / 60 + 35.0 / 3600;
        System.out.println("Speed is " + distance_km / time_hrs + " km per hour");
    }
}
