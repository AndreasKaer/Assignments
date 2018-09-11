package liang_3_1;

import java.util.Scanner;

public class Liang_3_1 {

    public static void main(String[] args) {
        // A scanner object is created
        Scanner input = new Scanner(System.in);

        // The promt to enter a, b, c is created
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // The discriminant (b*b -4ac) is also coomputed 
        double D = Math.pow(b, 2) - 4 * a * c;

        // The twoo roots of the equation is computed
        System.out.println("The equation has ");
        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("two roots " + root1 + " and " + root2);
        } else if (D == 0) {
            double root1 = -b + (Math.sqrt(Math.pow(D, 2)) / (2 * a));
            System.out.println("one root " + root1);
        } else {
            System.out.println("no real roots");
        }

    }

}
