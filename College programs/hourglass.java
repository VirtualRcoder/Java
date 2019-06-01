import java.util.*; 

public class hourglass
{  
	public static void main (String[] args) 
	{ 
 
		Scanner reader = new Scanner(System.in);
		int r=reader.nextInt(); 
	
		int i, j, k=0; 
	
		for (i = r; i >= 0; i--) 
		{  
		    for(j = 0; j < k*2; j++)
		        System.out.print(" ");
			for (j = i; j >= 0; j--) 
				System.out.print(j+" ");
			for (j = 1; j <= i; j++) 
				System.out.print(j+" ");	
		    k++;		
			System.out.println();
		}
		
		for (i = 1; i <= r ; i++) 
		{   
		    for(j = 2*2; j < k*2; j++)
		        System.out.print(" ");
			for (j = i; j >= 0; j--) 
				System.out.print(j+" ");
			for (j = 1; j <= i; j++) 
				System.out.print(j+" ");	
		    k--;
			System.out.println(); 
		}
	} 
}