
import java.util.*;

public class Fact {
    
    int fact1 = 1,n,i;
    String choice;
    
    public void calc()
    {
        do{
			fact1 = 1;
            Scanner in;
            in = new Scanner(System.in);
            System.out.println("Enter the no n : ");
            n = in.nextInt();
            if(n==0)
            {
                System.out.println("factorial is 0");
            }
            while(n!=0)
            {
                fact1 = fact1 * n;
                n--;
            }
			System.out.println("Factorial : "+fact1);
            System.out.println("do u want to continue (y/n) : ");
            choice = in.next();
        }while("y".equals(choice));
    }
    public static void main(String args[])
    {
        Fact f = new Fact();
        f.calc();
    }
    
}
