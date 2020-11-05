package chapter03;
import java.util.Scanner;
public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today_index = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int num = input.nextInt();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String today = days[today_index - 1];
        int future_index = (today_index + num) % 7;
        String future_day = days[future_index - 1];
        System.out.println("Today is " + today + " and the future day is " + future_day);
    }
}
