import java.util.*;
public class trianglenew {
    public static void main(String[] args) {
        int num,i,j,k;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        num=n.nextInt();
        for(i=1;i<=num;i++)
        {
            for(k=num;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        n.close();
    }
}
