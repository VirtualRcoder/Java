import java.util.*;
import java.lang.Math.*;
public class calculator {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int n1,n2,t=1,n;
    
        while(t!=0)
        {
            String ch = reader.next();
            if(ch.equals("*"))
            {   n1 = reader.nextInt();
                n2 = reader.nextInt();
                n2 = n2 * n1;
                System.out.println(n2);
            }
            else if (ch.equals("+"))
            {   n1 = reader.nextInt();
                n2 = reader.nextInt();
                n2 = n2 + n1;
                System.out.println(n2);
            }    
            else if(ch.equals("-")) 
            {
                n1 = reader.nextInt();
                n2 = reader.nextInt();
                n2 = n2 - n1;
                System.out.println(n2);
            }
            else if(ch.equals("/")) 
            {
                n1 = reader.nextInt();
                n2 = reader.nextInt();
                n2 = n1 / n2;
                System.out.println(n2);
                
            }
            else if(ch.equals("%")) 
            {   
                n1 = reader.nextInt();
                n2 = reader.nextInt();
                n2 = n1 / n2;
                System.out.println(n2);
                
            }
            
            else if(ch.equals("X")||ch.equals("x"))
                break;
            else
                System.out.println("Invalid operation. Try again.");
            
        }
    }
}
