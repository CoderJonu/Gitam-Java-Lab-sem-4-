import java.util.*;
public class leep {
    public static void main(String[] args)
    {
        int year;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the year: ");
        year=n.nextInt();
        if(year%4==0||year%400==0)
        {
            System.out.println("It is a leep year.");
        }
        else
        {
            System.out.println("It is not a leep year.");
        }
        n.close();
    }
}
