package chapter02;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initial_temperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double final_temperature = input.nextDouble();
        double energy_needed = weight * (final_temperature - initial_temperature) * 418455.;
        System.out.println("The energy needed is: " + energy_needed);
    }
}
