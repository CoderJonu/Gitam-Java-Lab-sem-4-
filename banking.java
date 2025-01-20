import java.util.Scanner;
public class banking {
    float balance=5000;
    public void deposited(float value)
    {
        System.out.println("Deposited: "+value);
        balance+=value;
        System.out.println("Balance after Deposited: "+balance);
    }
    public void withdrawn(float value)
    {
        System.out.println("Withdrawn: "+value);
        balance-=value;
        System.out.println("Balance after Withdrawal: "+balance);
    }
    public static void main(String[] args)
    {
        Scanner n = new Scanner (System.in);
        banking main=new banking();
        String name;
        int acc_no,yn;
        System.out.print("Enter your name: ");
        name=n.nextLine();
        System.out.print("\nEnter your account number: ");
        acc_no=n.nextInt();
        System.out.println("\nInitial Balance: 5000.0\n");
        while(true)
        {
            int choice;
            float value;
            System.out.print("\nWould you like to make what type of tranctation Deposit or Withdrawal\n");
            System.out.println("1.Deposit\n2.Withdrawal\n");
            System.out.print("Enter your choice: ");
            choice = n.nextInt();
            switch(choice)
            {
                case 1:         System.out.println("Enter the value you would like to Deposit: ");
                                value=n.nextFloat();
                                main.deposited(value);
                                break;
                case 2:         System.out.println("Enter the value you would ike to Withdraw: ");
                                value=n.nextFloat();
                                main.withdrawn(value);
                                break;
                default:        System.out.println("Enter proper choice.");
                                break;
            }
            System.out.println("Would you like to continue the procedure ?\n1.Yes\n2.No");
            yn=n.nextInt();
            if(yn==1)
            {
                continue;
            }
            else
            {
                System.out.println("\n\nThank You !\nVisit Again.");
                break;
            }
        }
    }
}