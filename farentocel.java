import java.util.Scanner;
public class farentocel {
    public static void main(String[] args)
    {
        int temp;
        System.out.println("Enter the temperature in Farenhit: ");
        Scanner n=new Scanner(System.in);
        temp =n.nextInt();
        double cel;
        cel=((temp*32-32)*5)/9;
        System.out.println("Temperature in celcious: "+cel);
        n.close();
    }
}
