import java.util.*;
public class weekdays {
    public static void main(String[] args)
    {
        int num;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the weekday from 1 to 7 to know the weekday.");
        System.out.println("Enter the day: ");
        num=n.nextInt();
        switch (num)
        {
            case 1:     System.out.println("Sunday");
            case 2:     System.out.println("Monday");
            case 3:     System.out.println("Tuesday");
            case 4:     System.out.println("Wednesday");
            case 5:     System.out.println("Thursday");
            case 6:     System.out.println("Friday");
            case 7:     System.out.println("Saturday");
            default:    System.out.println("Re-Run the code and enter a proper weekday from 1 to 7");
        }
        n.close();
    }
    
}
