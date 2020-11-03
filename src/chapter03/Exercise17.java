package chapter03;
import java.util.Scanner;
public class Exercise17 {
    public static void main(String[] args) {
        int computer = (int)(Math.random() * 3);
        Scanner scanner = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int input = scanner.nextInt();
        switch (computer) {
            case 0:
                if(input == 0) System.out.println("The computer is scissor. You are scissor too. It is a draw.");
                else if(input == 1) System.out.println("The computer is scissor. You are rock. You won.");
                else if(input == 2) System.out.println("The computer is scissor. You are paper. You lose.");
                break;
            case 1:
                if(input == 0) System.out.println("The computer is rock. You are scissor. You lose.");
                else if(input == 1) System.out.println("The computer is rock. You are rock too. It is a draw.");
                else if(input == 2) System.out.println("The computer is rock. You are paper. You won.");
                break;
            case 2:
                if(input == 0) System.out.println("The computer is paper. You are scissor. You won.");
                else if(input == 1) System.out.println("The computer is paper. You are rock. You lose.");
                else if(input == 2) System.out.println("The computer is paper. You are paper too. It is a draw.");
                break;
        }
    }
}
