import java.util.*;
public class chesttresure {
    public static void main(String[] args) 
    {
        Scanner n=new Scanner(System.in);
        int num,i,sum=0;
        System.out.println("Enter the number of tresure chest: ");
        num=n.nextInt();
        int chest[]=new int[num];
        for(i=0;i<num;i++)
        {
            int a;
            System.out.println("Enter chest "+(i+1)+" contents : ");
            a=n.nextInt();
            chest[i]=a;
        }
        for(i=0;i<num;i++)
        {
            if(chest[i]%2!=0&&chest[i]>0)
            {
                sum+=chest[i];
            }
            if(chest[i]<0)
            {
                System.out.println("Trap encountered at chest "+(i+1));
                break;
            }
        }
        System.out.println("Total tresure collected: "+sum);
        n.close();
    }
}
