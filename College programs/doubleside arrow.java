import java.util.*;
import java.lang.Math.*;
public class DoubleSidedArrow {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int i,j,nsp1=n-1,nsp2=0,f,d;
        f= (int)Math.ceil(n/2);
        d = n-f;

        for (i=1;i<=d;i++)
        {
            for (int csp = 1; csp <= nsp1 *2; csp++)
                System.out.print("  ");
           
            for (j=i;j>=1;j--)
                System.out.print(" "+j);
            for (int csp = 1; csp < nsp2; csp++)
                System.out.print("  ");
            
            if(i!=1)
                for (j=1;j<=i;j++)
                    System.out.print(" "+j);
           
                    
            System.out.println();
            
            nsp1--; 
            nsp2=nsp2+2;
        }
        
        nsp1=nsp1+2;nsp2=nsp2-2;
        
        
        for (i=f;i>0;i--){
            
            for (int csp = 1; csp <= nsp1*2; csp++)
                System.out.print("  ");
            
            for (j=i;j>=1;j--)
                System.out.print(" "+j);
           
           
           
           
           
            for (int csp = 1; csp <= nsp2; csp++)
                System.out.print(" ");
            if(i!=1)
                for (j=1;j<=i;j++)
                    System.out.print(" "+j);
            System.out.println();
    nsp1++;nsp2=nsp2-4;
        }

    }

}