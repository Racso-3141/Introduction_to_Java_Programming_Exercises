package chapter03;
import java.util.Scanner;
public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 edges: ");
        double edge1 = scanner.nextDouble();
        double edge2 = scanner.nextDouble();
        double edge3 = scanner.nextDouble();
        double sum1 = edge1 + edge2;
        double sum2 = edge2 + edge3;
        double sum3 = edge1 + edge3;
        if(sum1 > edge3 && sum2 > edge1 && sum3 > edge2) {
            System.out.println("The perimeter is: " + (edge1 + edge2 + edge3));
        } else {
            System.out.println("Inputs are not valid");
        }
    }
}
