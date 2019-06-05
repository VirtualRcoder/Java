import java.util.*;
import java.util.Arrays;

public class invertnumber{
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        String S = reader.nextLine();
        
        int l=S.length();
        char[] arr = S.toCharArray();
        char [] brr = new char [l];
        char min=arr[0];
        for (int i=0;i<l;i++)
            if(min > arr[i])
                min = arr[i];
        
        if(min == '0')
        {   char max = 0;
            for(int i=0;i<l;i++)
                if(arr[i] > max)
                    max = arr[i];
                    
            for (int i=0;i<l;i++)
                if(min == arr[i])
                    brr[i] = max;
                else
                    brr[i] = arr[i];
            
            min = brr[0];
            
            for (int i=0;i<l;i++)
                if(min > brr[i])
                    min = brr[i];
                
            System.out.print(min);
            for(int i=1;i<l;i++)
                System.out.print(0);    
        }
        else
            for(int i=0;i<l;i++)
                System.out.print(min);
            
    }
}


