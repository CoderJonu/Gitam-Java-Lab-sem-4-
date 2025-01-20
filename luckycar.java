import java.util.*;

public class luckycar {
    public int matching(int num)
    {
        int sum=0,n;
        n=num;
        while(n!=0)
        {
            sum=n%10+sum;
            n=n/10;
        }
        return sum;
    }
    public void compare(int number,int numb)
    {
        if(number==numb)
        {
            System.out.println("The car number matches with your lucky number.");
        }
        else
        {
            System.out.println("The car number dosent matches with the lucky number.");
        }
    }
    public static void main(String[] args) {
        luckycar main=new luckycar();
        Scanner n=new Scanner(System.in);
        int l,c;
        System.out.println("Enter your car number: ");
        c=n.nextInt();
        System.out.println("Enter your luck one digit number: ");
        l=n.nextInt();
        int i=1;
        while(i!=0)
        {
            if(c<=9&&c>=0)
            {
                main.compare(c,l);
                break;
            }
            if(c>9)
            {
                c=main.matching(c);
            }
            i++;
        }
        n.close();
    }
}
