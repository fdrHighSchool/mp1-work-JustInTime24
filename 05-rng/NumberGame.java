
/**
 * Write a description of class RandomNumberGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
         // place-holder for now
    
        
        int misses = 0;
        int playerGuess = 0;
        System.out.println("What difficulty? 1 = easy, 2 = standard, 3 = hard");
        String mode = s.nextLine();
        
        int maximum = 0;
        if(mode.equals("1")) {
            maximum = 10;
        }
        else if (mode.equals("2")) {
            maximum = 20;
        }
        else if (mode.equals("3")) {
            maximum = 30;
        }
        else if (mode.equals("4")) {
            System.out.println("Secret harder mode initiated.");
            maximum = 100;
        }
        int mysteryNumber = r.nextInt(maximum) + 1;
        
        //System.out.println(mysteryNumber);
    
        while (playerGuess != mysteryNumber) {
            System.out.print("Enter your guess: ");
            playerGuess = s.nextInt(); 
            if(playerGuess != mysteryNumber) {
                // if the player guessed too low
                misses += 1;
                if(playerGuess < mysteryNumber) {
                    //System.out.println("You were off by " + (mysteryNumber - playerGuess));
                    System.out.println("Too low!");
                } // end inner if statement
                // if the player didn't guess too low (meaning, incorrect and too high!)
                else {
                    //System.out.println("You were off by " + (playerGuess - mysteryNumber));
                    System.out.println("Too high!");
                } // end inner else statement
            } // end outer if statement
            // if the player didn't guess incorrectly (meaning, correct guess)
            else {
                System.out.println("Correct! You failed " + misses + " times before successfully guessing the correct number!");
            } // end outer else statement
        } // end loop
    } // end main method
}// end class