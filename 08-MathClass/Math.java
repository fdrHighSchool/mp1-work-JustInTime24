public class Math {
  public static void main(String[] args) { 
    
    // comment out each method call to test
    
    int x1 = 0, y1 = 0, x2 = 3, y2 = 4;
    
    System.out.println(euclideanDistance(x1, y1, x2, y2)); // returns 5.0
    System.out.println(taxicabDistance(x1, y1, x2, y2)); // returns 7
    
    // System.out.println(circleArea()); // returns 12.55637...
    
    // System.out.println(surfaceAreaCylinder()); // come up with your own test case!
    
    // System.out.println(heronsTriangle()); // come up with your own test case!
    
  } // end main method
  
  
   public static double euclideanDistance(float x1, float x2, float y1, float y2) {
       double dtX = (x2 - x1);
       double dtY = (y2 - y1);
       double euclideanDistance = Math.pow(dtX,2) + Math.pow(dtY,2);
       return euclideanDistance;
   } //close euclideanDistance 
  
  
      public static float taxicabDistance(float x1, float x2, float y1, float y2) {
        float taxicabDistance = (x2 - x1) + (y2 - y1);
        return taxicabDistance;
   } //close taxicabDistance
  
  
      public static double circleArea(double r) {
        r = 2;
        double circleArea = 3.14*(r*r);
        return circleArea;
   } //close circleArea
  
  
       public static double surfaceAreaCylinder(double r, double h) {
        r = 2;
        h = 6;
        double surfaceAreaCylinder = (2 * 3.14 * Math.pow(r,2)) + (2 * 3.14 * r * h);
        return surfaceAreaCylinder;
   } //close surfaceAreaCylinder
  
  
   public static double heronsTriangle(double s, double a, double b, double c) {
       s = 4;
       a = 3; 
       b = 2; 
       c = 1;
       double heronsTriangle = Math.sqrt(s*(s - a)*(s - b)*(s - c));
       return heronsTriangle;
   } //close herons Triangle
  
} // end class