import java.util.*;
public class Patternzeroes {
    public static void main(String args[]) {
        Scanner reader=new Scanner(System.in);
        int n= reader.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                {
                    if(i+j==i+1||i==j)
                        System.out.print(i+"    ");
                    else
                        System.out.print("0    ");
                }
            System.out.println();
        }        
    }
}    