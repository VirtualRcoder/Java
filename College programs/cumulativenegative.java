import java.util.*;
public class Cumulativenegative {
    public static void main(String args[]) {
        Scanner reader = new Scanner( System.in );
        int sum =0;
        while(sum>=0){
            int n =reader.nextInt();
            sum = sum + n;
            if (sum < 0)
                break;
            System.out.println(n);    
        }
    }
}