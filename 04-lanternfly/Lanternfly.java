
/**
 * Write a description of class Mothtest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly republic requires your tithe ");
        System.out.println("and demands you deliver now.");
        
        System.out.print("How much money will you give? ");
        int num = input.nextInt();
        
        if (num < 400) {
            System.out.println("Your body will strewn for all to see");
        } // end if statement
        else {
            System.out.println("Glory to the lanternfly republic");
        } // end else statement
        
    } // end main method

} // end class
