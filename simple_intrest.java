// import java.util.Scanner;
// public class simple_intrest {
//  public static void main(String[] args)   
//  {
//     int  num1,num2,sum,mul;
//     Scanner s = new Scanner(System.in);
//     // System.out.println("Enter the digit: ");
//     // System.out.println("Digit = "+num);
//     System.out.println("Enter number 1: ");
//     num1=s.nextInt();
//     System.out.println("Enter number 2: ");
//     num2=s.nextInt();
//     sum=num1+num1;
//     mul=num1*num2;
//     System.out.println("Product of both number is: "+mul);
//     System.out.println("Sum of both number is: "+sum);
//  }
// }
import java.util.Scanner;
public class simple_intrest {
   public static void main(String[] args) {
      int p,r,t,si;
      try (Scanner a=new Scanner(System.in);)
      {
         System.out.println("Enter priciple amount: ");
         p=a.nextInt();
         System.out.println("Enter your intrest percentage: ");
         r=a.nextInt();      
         System.out.println("Enter the time period: ");
         t=a.nextInt();
      }
      
      
      si=p*r*t;
      si/=100;
      System.out.println("Simple intrest is : "+si);
   }
}