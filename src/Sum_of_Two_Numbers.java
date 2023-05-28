import java.util.Scanner;

public class Sum_of_Two_Numbers {

	public static void main(String args[]) {
		int a, b;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A:");
			a = sc.nextInt();
			System.out.println("Enter B:");
			b = sc.nextInt();
		}
		System.out.println("SUM A+B:" + (a + b));
	}
}
