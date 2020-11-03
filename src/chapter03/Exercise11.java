package chapter03;
import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        String[] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(months[month - 1] + " " + year + " had 31 days");
        } else {
            if(month == 2) {
                if(isLeap) System.out.println(months[month - 1] + " " + year + " had 29 days");
                else System.out.println(months[month - 1] + " " + year + " had 28 days");
            } else {
                System.out.println(months[month - 1] + " " + year + " had 30 days");
            }
        }
    }
}
