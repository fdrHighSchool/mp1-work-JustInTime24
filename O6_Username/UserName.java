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
    s.close();
  } // end main method

  public static String genPass(int length) {
      String password = "";
      
      char c;
      for(int i=65;i<=90;i++) {
        c =(char)i;
        System.out.println(i+"  =  "+c);
        }
    return password;
    }
} // end class
