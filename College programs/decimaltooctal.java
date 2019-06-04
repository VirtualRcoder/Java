import java.util.*;
public class DecimalToOctal
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner( System.in );
    int n =reader.nextInt();
 
    
    int rem;

    String str=""; 
 

    char dig[]={'0','1','2','3','4','5','6','7'};
 
    while(n>0)
    {
       rem=n%8; 
       str=dig[rem]+str; 
       n=n/8;
    }
    System.out.println(str);
  }   
}