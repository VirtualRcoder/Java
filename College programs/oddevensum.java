import java.util.*;

public class oddevensum
{
    public static void main(String args[]) 
    {   Scanner reader = new Scanner(System.in);

        long n = reader.nextLong();
    
        long flag=0,counter=1,m,oddSum=0,evenSum=0;
             while (n!=0) {
               if(counter%2==0)
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

             System.out.print(evenSum);
             System.out.print(oddSum);
    }
}