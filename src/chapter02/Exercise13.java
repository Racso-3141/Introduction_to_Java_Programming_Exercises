package chapter02;
import java.util.Scanner;
public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        double amount_after_six_month = 0;
        for (int i = 0; i < 6; i++) {
            amount_after_six_month = (100 + amount_after_six_month) * (1 + 0.00417);
        }
        System.out.println("After the sixth month, the account value is " + amount_after_six_month);
    }
}
