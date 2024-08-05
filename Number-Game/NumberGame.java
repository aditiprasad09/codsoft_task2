import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        int totalRounds = 0;
        int totalAttempts = 0;

        while (playAgain) {
            totalRounds++;
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess the number between 1 and 100:");

            while (!hasGuessedCorrectly) {
                attempts++;
                totalAttempts++;
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    hasGuessedCorrectly = true;

                    System.out.println("Well done! You've guessed the correct number in " + attempts + " attempts.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Your guess is too low. Try again.");
                }
            }

            System.out.println("Would you like to play again?(yes/no)");
            String userResponse = scanner.next();

            if (userResponse.equalsIgnoreCase("no")) {
                playAgain = false;
            }
        }

        System.out.println("You played a total of " + totalRounds + " rounds.");
        System.out.println("You took a total of " + totalAttempts + " attempts.");
        System.out.println("Average attempts per round: " + ((double) totalAttempts / totalRounds));

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}