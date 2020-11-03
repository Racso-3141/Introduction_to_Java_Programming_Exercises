package chapter03;
import java.util.Scanner;
public class Exercise14 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 2);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess(0: head/1: tail): ");
        int guess = scanner.nextInt();
        if(answer == guess) System.out.println("Correct!");
        else System.out.println("False!");
    }
}
