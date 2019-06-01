import java.util.*;
public class shopping {
    public static void main(String args[]) {
        Scanner reader=new Scanner(System.in);
        int A=0,H=0;
        int T = reader.nextInt();
        while(T!=0){
            int M = reader.nextInt();
            int N = reader.nextInt();
            int F = 0;
            while(T!=0)
            {
                A = A + 1;
                H = H + 2;
                if(A>M)
                {
                    System.out.println("Harshit");
                    F = 1;
                }
                if(H>N)
                {
                    System.out.println("Aayush");
                    F = 1;
                }
            if(F==1){
                    break;
                }
            }
            T--;
        }    
            
    }
}