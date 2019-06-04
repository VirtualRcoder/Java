import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0, b = 1, sum = 0, count = 1;
		while (count < n) {


			sum = a + b;

			a = b;
			b = sum;
			
			count = count + 1;

		}
		System.out.print(sum+" ");
	}

}