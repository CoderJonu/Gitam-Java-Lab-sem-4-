import java.util.*;
public class guessingnos {
    public static boolean hunt(int rand, int user){
        int diff=user-rand;
        if(diff>=3 || diff<=-3){
            System.out.println("your guess is far");
            return false;
        }
        else if((diff<3 && diff>=1)||(diff>-3&&diff<=-1)){
            System.out.println("Your guess is close");
            return false;
        }
        return true;
    }
        public static void main(String[] args){
            Scanner n=new Scanner(System.in);
            int num;
            int value = (int)(Math.random()*(5-1+1)+1); 
            while(true){
                System.out.println("Enter the number to guess it right: ");
                num=n.nextInt();
                if(hunt(value,num)){
                    System.out.println("Found the number");
                    break;
                }
            }
        }

}