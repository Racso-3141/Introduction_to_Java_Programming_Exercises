package chapter03;
import java.util.Scanner;
public class Exercise04 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May",
        "June", "July", "August", "September", "October", "November", "December"};
        int number = 1 + (int)(Math.random() * 12);
        System.out.println(months[number]);
    }
}
