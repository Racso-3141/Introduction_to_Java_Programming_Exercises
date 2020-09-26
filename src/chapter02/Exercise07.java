package chapter02;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minuets: ");
        int minutes = input.nextInt();
        int years = minutes / (24 * 60 * 365);
        int days = minutes % (24 * 60 * 365) / (24 * 60);
        System.out.println(minutes + " minutes is " + years + " years and " + days + " days");

    }
}
