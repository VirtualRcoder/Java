import java.util.*;
import java.lang.*;

public class mirrorstar
{
    
 
    public static void main(String[] args)
    {
             
  Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        int start = 0;
        int c=4;
        for (int i = 1; i < (n * 2); i++) 
        {
            
            for (int spc = Math.abs(n - i) + c; spc > 0; spc--) 
            {
                System.out.print(" ");
            }
            if (i < n) 
            {
                start = i;     
                c=c-1;
            } 
            else 
            {
                start = n * 2 - i;
                c=c+1;
            }
            
            for (int j = 0; j < count; j++) 
                System.out.print("* ");
            
            if (i < n)
                count = count + 2;
            else
                count = count - 2;

            System.out.println();
        }  
        
    }
}