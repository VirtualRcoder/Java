import java.util.*;
import java.lang.Math.*;

public class HollowDiamond {
    public static void main(String args[]) {
        Scanner reader=new Scanner(System.in);
        double n= reader.nextInt();
        double x = Math.ceil(n/2);
        double i,j;
        for(i=0;i<n;i++)
        {
            
           for(j=0;j<n;j++)
                {   if(i<x)
                    {
                        if(j<x)
                        {    
                            if(i+j<x)
                                System.out.print("*    ");
                            else
                                System.out.print("     ");
                        }   
                    
                        if(j>=x)
                        {   
                            if(i+j==n&&j!=n-1)
                                System.out.print("     ");
                            else
                                System.out.print("*    "); 
                        }
                    }    
                    else
                    {
                        if(i+j==n&&i!=n-1)
                            System.out.print("     ");
                        else
                            System.out.print("*    "); 
                    }
                    
                }    
                System.out.println();        
        }
        
    }
}    