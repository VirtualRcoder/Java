import java.util.Scanner;

public class prime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int flag = 0;

		for (int div = 2; div <= n - 1; div++) {
			if (n % div == 0) {
				flag = 1;
			}
		}

		if (flag == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}