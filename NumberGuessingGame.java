import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int attempts = 0;

        System.out.println("🎲 Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
                int score = Math.max(100 - attempts * 5, 0); // Score logic
                System.out.println("🏆 Your score: " + score);
                break;
            } else if (guess < numberToGuess) {
                System.out.println("⬆️ Try a higher number.");
            } else {
                System.out.println("⬇️ Try a lower number.");
            }

            // Optional limit
            if (attempts >= 10) {
                System.out.println("😞 You've reached the maximum number of attempts. The number was: " + numberToGuess);
                break;
            }
        }

        sc.close();
    }
}
