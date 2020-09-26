package chapter02;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double degree_Celsius = input.nextDouble();
        double Degree_Fahrenheit = degree_Celsius * (9.0 / 5) + 32;
        System.out.println(degree_Celsius + " Celsius is "
                + Degree_Fahrenheit + " Fahrenheit");
    }
}
