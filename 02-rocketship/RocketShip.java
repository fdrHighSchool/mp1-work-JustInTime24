
/**
 * Write a description of class RocketShip here.
 *
 * @author (Justin)
 * @version (a version number or a date)
 */
public class RocketShip
{
    public static void main(String[] args) {
        tip();
        body();
        System.out.println("|United|");
        System.out.println("|States|");
        body();
        tip(); 
    }
        //Repeat but more efficient
        public static void tip() {
        System.out.println("   /\\   "); //three spaces before typing
        System.out.println("  /  \\  "); //two spaces before typing
        System.out.println(" /    \\ "); //one space before typing
    }
        public static void body() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}

