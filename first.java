import java.utils.Scanner;
class{
	public static void main{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the numbers:\n");
		
		int first = reader.nextInt();
		int second = reader.nextInt();

		int result = first + second;
		System.out.print("The Sum is:-"+result);
	}
}
