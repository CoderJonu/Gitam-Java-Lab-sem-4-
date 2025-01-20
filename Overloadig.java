import java.util.Scanner;
class Cmp {
    public int compare(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else if (n2 > n1) {
            return n2;
        } else {
            return n1;
        }
    }
    public float compare(float n1, float n2) {
        if (n1 > n2) {
            return n1;
        } else if (n2 > n1) {
            return n2;
        } else {
            return n1;
        }
    }
    public char compare(char n1, char n2) {
        if (n1 > n2) {
            return n1;
        } else if (n2 > n1) {
            return n2;
        } else {
            return n1;
        }
    }
    public String compare(String n1, String n2) {
        if (n1.length() > n2.length()) {
            return n1;
        } else if (n2.length() > n1.length()) {
            return n2;
        } else {
            return n1;
        }
    }
}
public class Overloadig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        System.out.println("Enter two floats: ");
        float float1 = scanner.nextFloat();
        float float2 = scanner.nextFloat();

        System.out.println("Enter two characters: ");
        char char1 = scanner.next().charAt(0);
        char char2 = scanner.next().charAt(0);

        System.out.println("Enter two strings: ");
        String str1 = scanner.next();
        String str2 = scanner.next();

        Cmp cmp = new Cmp();

        System.out.println("Larger integer: " + cmp.compare(int1, int2));
        System.out.println("Larger float: " + cmp.compare(float1, float2));
        System.out.println("Larger character: " + cmp.compare(char1, char2));
        System.out.println("Larger string (by length): " + cmp.compare(str1, str2));

        scanner.close();
    }
}
