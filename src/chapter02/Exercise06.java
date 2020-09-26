package chapter02;
import java.util.Scanner;
public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();
        int digit_0 = num % 10;
        int digit_1 = (num / 10) % 10;
        int digit_2 = (num / 100);
        int sum = digit_0 + digit_1 + digit_2;
        System.out.println("The sum of digits is " + sum);
    }
}
