import java.util.*;

public class prime{    
 public static void main(String args[]){    
    int i,j,	m=0,c=0;         
    Scanner reader = new Scanner(System.in);
    
    int n = reader.nextInt();
           
   for(i=2;i<=n;i++){
   c=0;
   		for(j=2;j<=n;j++){
		    if(i%j==0){ 
		     c=c+1;     
		    }       
   		}  

		if(c<2){
   			System.out.println(i);}     
	}    

  }  
}