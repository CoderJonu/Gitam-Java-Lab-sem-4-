import java.util.*;
public class tresurecoins {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        float p,q,r,s,tc,d,t;
        System.out.println("Enter the value for P: ");
        p=n.nextFloat();
        System.out.println("Enter the value for Q: ");
        q=n.nextFloat();
        System.out.println("Enter the value for R: ");
        r=n.nextFloat();
        System.out.println("Enter the value for S: ");
        s=n.nextFloat();
        System.out.println("Enter the value for T: ");
        t=n.nextFloat();
        tc=p*q+r-s/t;
        d=(3*tc)/100;
        int v=Math.round(d);
        tc-=d;
        tc/=3;
        int m=Math.round(tc);
        System.out.println("Coins for Dashrath: "+v);
        System.out.println("Coins for Father: "+m);
        System.out.println("Coins for Mother: "+m);
        System.out.println("Coins for Sister: "+m);
        n.close();
    }
}