import java.util.Scanner;
import java.util.Random;
public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    Random rand = new Random();
    
    int rand_int1 = rand.nextInt(10);
    int rand_int2 = rand.nextInt(10);
    int rand_int3 = rand.nextInt(10);
    int rand_int4 = rand.nextInt(10);
    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number in number form: ");
    String favNum = s.nextLine();
    // test output
    //System.out.println("Hello " + initialize(firstName) + "." + initialize(lastName) + ".");
    System.out.print("Are you a student or a teacher? ");
    String Role = s.nextLine().toLowerCase();
    
    if (Role .equals("student")) {
        System.out.println(firstName + lastName.substring(0, 1) + favNum + "@nycstudents.net");
    }//close if student statement
    if (Role .equals("teacher")) {
        System.out.println(firstName.substring(0, 1) + lastName + favNum + "@schools.nyc.gov");
    }//close if teacher statement
    System.out.println("Your password is: " + rand_int1 + rand_int2 + rand_int3 + rand_int4);
    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class
