
import java.util.Scanner;


public class Fib {
    int n,count=2;
    String choice;
    public void calc()
    {
        do{
            Scanner in=new Scanner(System.in);
            System.out.print("enter the val of n : ");
            n = in.nextInt();
            int f1=0,f2=1,f3=0;
            if(n==1)
            {
                System.out.println(f1);
            }
            else if(n==2)
            {
                System.out.println(f1+"\t"+f2);
            }
            else if(n>2&&n!=0)
            {
            System.out.print(f1+"\t"+f2);
            while(  (f2<n)&&(f3<n)&&(f1<n)&&(count<n)  )
            {
                f3 = f1+f2;
                if(f3<n)
                {
                    System.out.print("\t"+f3);
                }
                f1=f2;
                f2=f3;
                count+=1;
            }
            }
            System.out.println("\ndo u want to continue (y/n): ");
            choice = in.next();
        }while("y".equalsIgnoreCase( choice ) );
    }
    
    public static void main(String[] args) {
        //System.out.println("hello");
        Fib f = new Fib();
        f.calc();
    }
    
}
