package chapter03;
import java.util.Scanner;
public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number = scanner.nextInt();
        int checksum =
                ((number / 100000000 % 10) +
                        (number / 10000000 % 10) * 2 +
                        (number / 1000000 % 10) * 3 +
                        (number / 100000 % 10) * 4 +
                        (number / 10000 % 10) * 5 +
                        (number / 1000 % 10) * 6 +
                        (number / 100 % 10) * 7 +
                        (number / 10 % 10) * 8 +
                        (number % 10) * 9) % 11;
        System.out.print("The ISBN-10 number is ");
        System.out.print(number);

        if (checksum == 10)
            System.out.print("X");
        else
            System.out.print(checksum);
    }
}
