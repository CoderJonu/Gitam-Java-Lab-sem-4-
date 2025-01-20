import java.util.*;
public class bulbglow {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int num;
        System.out.println("Enter the number of bulbs: ");
        num=n.nextInt();
        int bulb[]=new int[num];
        for(int i=0;i<num;i++)
        {
            int b;
            System.out.println("Enter the value for bulb "+(i+1)+": ");
            b=n.nextInt();
            bulb[i]=b;
        }
        System.out.println("The above bulbs show the following lights.");
        for(int i=0;i<num;i++)
        {
            if(bulb[i]%3==0&&bulb[i]%5==0)
            {
                System.out.println("Bulb "+(i+1)+" glows Yellow in colour.");
            }
            else if(bulb[i]%3==0&&bulb[i]%5!=0)
            {
                System.out.println("Bulb "+(i+1)+" glows Green in colour.");
            }
            else if(bulb[i]%5==0&&bulb[i]%3!=0)
            {
                System.out.println("Bulb "+(i+1)+" glows Red in colour.");
            }
            else
            {
                System.out.println("Bulb "+(i+1)+" remains off.");
            }
        }
        n.close();
    }
}
