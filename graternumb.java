import java.util.Scanner;
public class graternumb {
    public static void main(String[] args)
    {
        int a,b,c;
        System.out.println("Greater number code.");
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        a=n.nextInt();
        System.out.println("Enter the value for b: ");
        b=n.nextInt();
        System.out.println("Enter the value for c: ");
        c=n.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("A is greatest amoung the three");
        }
        if(b>a&&b>c)
        {
            System.out.println("B is greatest amoung the three");
        }
        if(c>a&&c>b)
        {
            System.out.println("C is greatest amoung the three");
        }
        if(a==b&&a==c)
        {
            System.out.println("All values are same.");
        }
        n.close();
    }
}
