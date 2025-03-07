import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
    
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
    System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess(){
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // use hasNextDouble to check if input is numeric, 
        if(scanner.hasNextDouble()){

        // if so...
            double userInput = scanner.nextDouble();

        // Read user input
            int guess = (int) userInput;
            
        // Compare it with the random number
            if(guess == rnd_number){
        // Let the user know the result of the comparison

            System.out.println("Gratz! You guessed the number! :)" + rnd_number);

        // Let the user try again by calling this method recursively
            } else if(guess < rnd_number){

        // Help the user by revealing wether the guess was lower or higher than the target number
                System.out.println("Too low! :( pls try again");

                // Call this method recursively to allow another guess.
                makeAGuess();
            } else {
                // Tell the user that the guess is too high.
                System.out.println("Too high! :( pls try again");
                makeAGuess();
            }
        } else {
        // if input was not numeric show an error message and call this method recursively
            System.out.println("Invalid input. Please enter a numeric value >:(");
            scanner.next();
            makeAGuess();
        }
    }
}
