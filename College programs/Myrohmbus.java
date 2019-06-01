import java.util.*;
import java.lang.*;
public class rohmbus
{
    
 
    public static void main(String[] args)
    {
             
	      Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int count = 1;
        int start = 0;
        int s = reader.nextInt();
        int c = s *2;
        for (int i = 1; i < (n * 2); i++) 
        {

            for (int spc = Math.abs(n - i) + c; spc > 0; spc--) 
            {  
                System.out.print(" ");
            }
            if (i < n) 
            {
                start = i;  
                c=c-4;
            } else 
            {
                start = n * 2 - i;
                c=c+4;
            }
            for (int j = 0; j < count; j++) 
            {
                System.out.print(start);
                for(s=s;s>0;s--)
                    System.out.print(" ");
                if (j < count / 2) 
                {
                    start++;
                } else 
                {
                    start--;
                }
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