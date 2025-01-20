import java.util.Scanner;
public class inchestomtrs {
    public static void main(String[] args)
    {
        int inch;
        System.out.println("Enter the measurement in inches: ");
        Scanner n=new Scanner(System.in);
        inch =n.nextInt();
        double mtr;
        mtr=inch*0.0254;
        System.out.println("Measurement in meters: "+mtr);
        n.close();
    }
}
