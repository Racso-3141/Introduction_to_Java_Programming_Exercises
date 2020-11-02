package chapter03;
import java.util.Scanner;
public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if(discriminant  > 0) {
            double root1 = (-1 * b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-1 * b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        } else if(discriminant  == 0) {
            double root = b / (-2 * a);
            System.out.println("The equation has one root " + root);
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
