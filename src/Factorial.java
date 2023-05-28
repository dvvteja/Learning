import java.util.Scanner;

public class Factorial {
	public static int Fact(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * Fact(n - 1);
	}

	public static void main(String args[]) {
		int a;
		System.out.print("Enter a number:");
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
		}
		System.out.println("Factorial of " + a + " :" + Fact(a));
	}
}
