package chapter03;

public class Exercise24 {
    public static void main(String[] args) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        int random_rank = (int)(Math.random() * 13);
        int random_suit = (int)(Math.random() * 4);
        System.out.println("The card you picked is " + ranks[random_rank] + " of "
                + suits[random_suit]);
    }
}
