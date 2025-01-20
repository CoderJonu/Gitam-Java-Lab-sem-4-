import java.util.*;
public class hello {
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a alphabet: ");
        char a=n.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        {
            System.out.println("it is a Vowel");
        }
        else
        {
            System.out.println("it is a consonent.");
        }

    }
}
