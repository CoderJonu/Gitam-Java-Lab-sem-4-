import java.util.*;
public class comparision {
    public static void main(String[] args)
    {
        float num1,num2;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1=n.nextFloat();
        System.out.println("Enter number 2: ");
        num2=n.nextFloat();
        if(num1==num2)
        {
            System.out.println("Both the number is same");
        }
        else
        {
            System.out.println("Both of them are not same.");
        }
        n.close();
        // char a;
        // Scanner n=new Scanner(System.in);
        // a=n.next().charAt(0);
        // int num;
        // num=a;
        // System.out.println(num);
        // n.close();

    }
}
