import java.util.*;
public class casecheck {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        char S = reader.next().charAt(0);
        if(!((S>='a' && S<='z') || (S>='A' && S<='Z')))
            System.out.println("Invalid");
        else    
        {   String t = String.valueOf(S);
            String upper = t.toUpperCase();
            String lower = t.toLowerCase();
            if(t == upper)
                System.out.println("UPPERCASE");
            else
                System.out.println("LOWERCASE");
        }
            
        }
}

