import java.util.*;

public class Fibonnacipattern{
    public static void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        
       int a=0,b=1,sum=0;
        System.out.println(a);
        a=1;b=1;
        
        if(n>=2)
            {
            System.out.print(b+"    ");
            System.out.print(b);
            }
        if(n>2){    
            System.out.println();
            for(int i=3;i<=n;i++)
                {
                   for(int j=1;j<=i;j++)
                    {
                        sum = a + b;
                        System.out.print(sum+"    ");
                        a=b;
                        b=sum;
                    }    
                    System.out.println();              
                }
            }
            
        }
}