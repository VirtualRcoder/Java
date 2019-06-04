import java.util.Scanner;
import java.lang.Math.*;
public class quadratic
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner( System.in );
    
    int a =reader.nextInt();
    int b =reader.nextInt(); 
    int c =reader.nextInt();
    int d = Math.abs(b*b-(4*a*c));
    int x = (int) (-b+Math.sqrt(d))/2*a;
    int x1 = (int) (-b-Math.sqrt(d))/ 2*a;
    if(d>0)
    {    System.out.println("Real and Distinct");
        System.out.println(x1+" "+x);   
    }
    else if(d==0)
    {
         System.out.println("Real and Equal");
        System.out.println(x1+" "+x);   
    }
    else
        System.out.print("Imaginary");
        
    }
}