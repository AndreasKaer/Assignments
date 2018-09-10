
package opg_a1;

public class Opg_A1 {

    public static void main(String[] args) {
        
        // Define the radius oof my circles
        int rad1 = 1;
        int rad2 = 2;
        int rad3 = 3;
        int rad4 = 4;
        int rad5 = 5;
        
        
        // Compute the area of the circles
        int area1 = (int) (3.14 * Math.pow(rad1, 2));
        int area2 = (int) (3.14 * Math.pow(rad2, 2));
        int area3 = (int) (3.14 * Math.pow(rad3, 2));
        int area4 = (int) (3.14 * Math.pow(rad4, 2));
        int area5 = (int) (3.14 * Math.pow(rad5, 2));
        
       
        // Print the results 
        System.out.println("The area of a circle with a radius of 1 is " + area1);
        System.out.println("The area of a circle with a radius of 2 is " + area2);
        System.out.println("The area of a circle with a radius of 3 is " + area3);
        System.out.println("The area of a circle with a radius of 4 is " + area4);
        System.out.println("The area of a circle with a radius of 5 is " + area5);
        
        
    
    }
    
}
