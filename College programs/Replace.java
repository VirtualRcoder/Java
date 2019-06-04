import java.util.*;
public class Replacewithfive {
    public static void main(String args[]) {
        
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int x,l=0;x=n;
        int  f[ ] = new int[100];
        
        while(n!=0)
        {
            n=n/10;
            l++;
        }n=x;
        if(n==0)
            l=1;
        for(int i=l-1;i>=0;i--)
        {   
            x = n % 10;
            n = n / 10;
            if(x==0)
                f[i] = 5;
            else
                f[i] = x;
            if(n==0)
                break;
        }
        for(int i=0;i<l;i++)
            System.out.print(f[i]);
    }
}