import java.util.*;

public class patterninversehourglass {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int c=18;int s=rows;
        for(int i = rows; i >=0; i--)
        {    
            int k=rows;
            for(int j=k;j>=i;j--)
                System.out.print(j+" ");
            
            if(s>0)
            {    for(int j = 0; j<c; j++)
                    System.out.print(" ");
                for(int j = s-1; j<rows; j++) 
                    System.out.print(j+1+" ");
            }
            
            else
                for(int j = s; j<rows; j++) 
                    System.out.print(j+1+" ");
            s--;

            System.out.println();
            c=c-4;
        }
        c=0;s=2;
        for(int i = 1; i<=rows; i++)
        {    
            int k=rows;
            for(int j=k;j>=i;j--)
                System.out.print(j+" ");
    
            for(int j = 0; j<s; j++)
                    System.out.print(" ");
    
            for(int j=1+c;j<=k;j++)
                System.out.print(j+" ");
            c=c+1;
            s=s+4;
            System.out.println();
        }
        
        
    }
}
