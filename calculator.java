import java.util.Scanner;
//import String;
public class calculator {
    public static void main(String[] args)
    {
        int n1,n2,diff,div,sum,prod,rem,i=1;
        char op1;
        Scanner n= new Scanner(System.in);
        while(i==1)
        {
            System.out.println("1.Addition\n2.Subtraction.\n3.Multiplication.\n4.Division.\n5.Reminder.\nEnter your choice: ");
            //Object input;
            op1=n.nextLine().charAt(0);
            System.out.println("Enter the value for number 1: ");
            n1=n.nextInt();
            System.out.println("Enter the value for number 2: ");
            n2=n.nextInt();
            switch(op1)
            {
                case '+':     sum=n1+n2;
                            System.out.println("Sum of the numbers is: "+sum);
                            break;
                case '-':     if(n1>n2)               
                            {
                                diff=n1-n2;
                            }
                            else
                            {
                                diff=n2-n1;
                            }
                            System.out.println("Difference of both numbers is: "+diff);
                            break;
                case '*':     prod=n1*n2;
                            System.out.println("Product of two number is: "+prod);
                            break;
                case '/':     if(n1>n2)               
                            {
                                div=n1/n2;
                            }
                            else
                            {
                                div=n2/n1;
                            }
                            System.out.println("Difference of both numbers is: "+div);
                            break;
                case '%':     if(n1>n2)               
                            {
                                rem=n1%n2;
                            }
                            else
                            {
                                rem=n2%n1;
                            }
                            System.out.println("Difference of both numbers is: "+rem);
                            break;
                default:    System.out.println("PLease enter a proper operator.");
            }
            System.out.println("Do you want to continue to calculate ?\n1->Yes\n0->No");
            i=n.nextInt();
        }
        n.close();

    }
}