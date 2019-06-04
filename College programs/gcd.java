import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int divident = scn.nextInt();
		int divisor = scn.nextInt();

		int rem = divident % divisor;
		while (rem != 0) {

			divident = divisor;
			divisor = rem;

			rem = divident % divisor;

		}

		System.out.println(divisor);
	}

}
