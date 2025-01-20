import java.util.Scanner;
public class ifelsestatement {
    public static void main(String[] argument) {
        int a;
        System.out.println("Enter your age: ");
        try (Scanner s = new Scanner(System.in)) {
            a=s.nextInt();
        }
        if(a>18)
        {
            System.out.println("You are eligible for voting.");
        }
        else if(a==18)
        {
            System.out.println("You have just turned 18 so better get all your necessary cards.");
        }
        else
        {
            System.out.println("Sorry your not eligible for voting.");
        }
    }
}