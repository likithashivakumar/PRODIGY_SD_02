import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a Random object to generate a random number
        Random random = new Random();
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        int userGuess = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Loop until the user correctly guesses the number
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfAttempts++;

            // Provide feedback on the user's guess
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            }
        }

        // User guessed the correct number
        System.out.println("Congratulations! You guessed the number correctly.");
        System.out.println("It took you " + numberOfAttempts + " attempts to guess the number.");
        
        // Close the scanner
        scanner.close();
    }
}
