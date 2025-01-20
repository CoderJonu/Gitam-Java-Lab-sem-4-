import java.util.*;
public class sumnavg {
    public static void main(String[] agrs)
    {
        int num,i,sum=0,avg;
        Scanner n=new Scanner(System.in);
        for(i=1;i<=5;i++)
        {
            System.out.println("Enter number "+i+":");
            num=n.nextInt();
            sum+=num;
        }
        avg=sum/5;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
        n.close();
    }
}