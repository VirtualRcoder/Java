import java.util.*;
public class series {
    public static void main(String args[]) {
        
        Scanner reader = new Scanner(System.in);
        int N1 = reader.nextInt();
        int N2 = reader.nextInt();
        int r;
        for(int i = 1; i <= N1; i++)
        {   r = 3*i + 2;
            if(r%N2!=0)
                System.out.println(r);
            else
                N1++;
        }
        
    }
}