import java.util.*;
public class quadriatic {
    public static void main(String[] args) {
        double a, b, c, d, x1, x2;
        Scanner n = new Scanner(System.in);
        System.out.println("Hello...\nEnter the values to solve the equation and find the roots...");
        System.out.println("\nThe equation must be of the form ax^2 + bx + c\n");
        System.out.print("Enter the value for a: ");
        a = n.nextDouble();
        System.out.print("Enter the value for b: ");
        b = n.nextDouble();
        System.out.print("Enter the value for c: ");
        c = n.nextDouble();
        d = (b * b) - (4 * a * c);
        if (d >= 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (x1 == x2) {
                System.out.println("Same roots. Hence, the root is: " + x1);
            } else {
                System.out.println("Different roots.");
                System.out.println("Root 1: " + x1);
                System.out.println("Root 2: " + x2);
            }
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            
            System.out.println("Complex roots:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        n.close();
    }
}