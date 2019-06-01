import java.util.*;
import java.lang.*;

public class PatternTriangle
{
    
 
    public static void main(String[] args)
    {
             
  Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        int start = 0;
        int c=18;
        for (int i = 1; i <= (n ); i++) 
        {
            
            for (int spc = Math.abs(n - i) + c; spc > 0; spc--) 
                System.out.print(" ");
            
            start = i;     
            c=c-6;
 
            if(i==n)
                start = n * 2 - i;
            
            for (int j = 0; j < count; j++) 
            {
                System.out.print(start+"      ");
                if (j < count / 2) 
                    start++;
                else 
                    start--;
            }
            if (i < n)
            {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }  }
}