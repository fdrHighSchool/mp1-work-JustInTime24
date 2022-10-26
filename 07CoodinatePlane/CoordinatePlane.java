import java.util.Scanner;

public class CoordinatePlane {
  public static void main(String[] args) {
    do {
    Scanner s = new Scanner(System.in);
    String point1, point2;

    System.out.print("Please enter a point in the form (x, y): ");
    point1 = s.nextLine();
    
    System.out.print(checkInput(point1));
    
    System.out.print("Please enter a second point: ");
    point2 = s.nextLine();
    
    System.out.print(checkInput(point2));
    
    int x1 = getX(point1);
    int x2 = getX(point2);
    System.out.println(x1 + " " + x2);
    // check if the user input the point correctly
    // if yes, continue code
    // if no, get the input again

    }  while (); //end do command
} // end main method
public static boolean checkInput (String p) {
    boolean status = true;
    if (p.indexOf("(") != 0) {
            status = false;
    } //close if 1
    if (p.indexOf(", ") == -1) {
            status = false;
    } //close if 2
    if (p.indexOf(")") != p.length() - 1) {
        status = false;
    } //close if 3
} //close boolean checkInput
public static int getX(String point) {
    // determine where the comma is located
    int commaPos = point.indexOf(",");

    // grab substring from after parentesis up to comma
    String x = point.substring(1, commaPos);

    // return value back to main so it can be used later in the program
    return Integer.parseInt(x);
      } // end getX method
    }