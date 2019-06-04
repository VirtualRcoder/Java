import java.util.*;

public class oddeven
{
    public static void main(String args[]) 
    {   Scanner reader = new Scanner(System.in);
    
        int t = reader.nextInt();
        while(t!=0)
        {

        long n = reader.nextLong();
    
        long flag=0,counter=1,m,oddSum=0,evenSum=0;
             while (n!=0) {
                long x=n%10;
               if(x%2==0)
               {
                 evenSum += n % 10;
                 n /= 10;
               }
               else
               {
                 oddSum += n % 10;
                 n /= 10;
               }
               counter++;
             }

             if(evenSum%4==0||oddSum%3==0)
                System.out.println("Yes");
             else 
                System.out.println("No");
            t--;    
        }     
    }
}