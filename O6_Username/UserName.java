import java.util.Scanner;
import java.util.Random;
public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    Random rand = new Random();
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
    
    generatePassword(8);
    
    if (Role .equals("student")) {
        System.out.println(firstName + lastName.substring(0, 1) + favNum + "@nycstudents.net");
    }//close if student statement
    if (Role .equals("teacher")) {
        System.out.println(firstName.substring(0, 1) + lastName + favNum + "@schools.nyc.gov");
    }//close if teacher statement
    
    s.close();
  } // end main method
  
  public static String generatePassword(int length) {
    String password = "";
    for(int i = 0; i < length; i++) {
      // generate a random number
      // 65 - 90 capital letter
      // 97 - 122 lower case
      // 33 - 47 special symbols
      int rand = (int)(Math.random()*(122-33+1) + 33);
      
      // convert the int ---> Character (char)i 
      char c = (char)rand;
      //System.out.print(rand + c);
      password += c;
    
      // add the char to the password String
      
    } // end for loop
    System.out.println("Your password is: " + password);
    return password; 
}
} // end class
