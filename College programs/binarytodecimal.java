import java.util.*;

public class binarytodecimal{      
public static void main(String args[])
  { 
    int decimal = 0;  
    int n = 0;
    Scanner sc = new Scanner(System.in);
    int binary=sc.nextInt();   
    while(true){  
      if(binary == 0){  
        break;  
      } 
      else 
      {  
        int temp = binary%10;  
        decimal += temp*Math.pow(2, n);  
        binary = binary/10;  
        n++;  
       }  
    }  
  System.out.print(decimal); 
}
}