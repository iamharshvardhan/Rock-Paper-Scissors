import java.util.*;

public class Play {
    public static int playerChoice;
    public static int computerChoice;
    public static int score;
    public static Scanner scanner = new Scanner(System.in);

    public static void player() {
        System.out.println("Welcome to Rock Paper Scissor!\nYou have Three Chances.");
        int range = 2 - 0 + 1;
        for (int i = 0; i < 3; i++) {
            System.out.print("What do you choose? Type 0 for Rock, 1 for Paper or 2 for Scissors. ");
            playerChoice = scanner.nextInt();
            System.out.println("You chose : " + playerChoice);

            if (playerChoice > 2 || playerChoice < 0) {
                System.out.println("Chose the wrong number, you lose!");
            }
            else {
                icons.showHand(playerChoice);
                computerChoice = (int)(Math.random() * range);
            }

            System.out.println("Computer chose : " + computerChoice);
            icons.showHand(computerChoice);

            if (playerChoice == computerChoice) {
                System.out.println("Draw");
            }
            else if (playerChoice > 2 || playerChoice < 0) {
                System.out.println("chose the wrong number, you lose!");
            }
            else if (playerChoice == 0 && computerChoice == 2) {
                System.out.println("You Win!");
                score += 1;
            }
            else if (playerChoice == 2 && computerChoice == 0) {
                System.out.println("You Lose!");
            }
            else if (playerChoice < computerChoice) {
                System.out.println("You Lose!");
            }
            else if (playerChoice > computerChoice) {
                System.out.println("You Win!");
                score += 1;
            }
        }

        System.out.println("You won " + score + " out of 3 times.");
        if (score > 1) {
            System.out.println("Congratulation! You Win.");
        }
        else {
            System.out.println("You Lost. Better Luck next time.");   
        }
    }
}
