#this is the code 
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(1000) + 1; // Generates a random number between 1 and 1000
        int numberOfGuesses = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between 1 and 1000. Can you guess it?");

        while (true) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            numberOfGuesses++;

            if (playerGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed it right in " + numberOfGuesses + " tries.");
                break;
            } else if (playerGuess < numberToGuess) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
        }

        System.out.println("The correct number was: " + numberToGuess);
        scanner.close();
    }
}
