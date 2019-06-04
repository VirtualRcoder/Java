import java.util.*;

public class vonneumman{      
public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t!=0)
    {   
        int n = 0;
        int decimal = 0;
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
      System.out.println(decimal);
      t--;
    }
}
}