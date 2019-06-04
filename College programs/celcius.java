import java.util.*;
import java.lang.Math.*;
public class celcius {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int mif = reader.nextInt();
        int maf = reader.nextInt();
        int s = reader.nextInt();
        double c;
        int x;
        while(maf>=mif)
        {
            c = Math.abs(mif-32);
            c = (5/9.0)*c;
            x = (int) c;
            if(mif-32<0)
                System.out.println(mif+" -"+x);
            else
                System.out.println(mif+" "+x);
            mif = mif + s;
        }
    }
}
