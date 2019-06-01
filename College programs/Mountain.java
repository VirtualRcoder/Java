import java.util.*;

public class patternladder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i = 1; i <= rows; ++i)
        {    for(int j = 1; j <= i; ++j) 
                {
                System.out.print(j+"      ");
                }
            for(int j = 2*i; j<2*rows-1; j++)
            {
                System.out.print("       ");
            }
            
            if(i!=rows)
                for(int j=i;j>0;j--)
                    System.out.print(j+"      ");
            else
               for(int j=i-1;j>0;j--)
                    System.out.print(j+"      ");
                
            System.out.println();
        }
        
    }
}
