import java.util.*;
public class tables {
    public static void main(String[] args)   
    {
        int i,num;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number you need the multiplication table of: ");
        num=n.nextInt();
        for(i=1;i<=10;i++)
        {
            int sum;
            sum=i*num;
            System.out.println(i+"x"+num+"="+sum);
        }
        n.close();
    }
}
