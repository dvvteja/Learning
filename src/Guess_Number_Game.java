import java.util.Scanner;

public class Guess_Number_Game {
	public static void guess_the_number() {
		int i, k = 5;
		int num = (int) (Math.random() * 100);
		System.out.println("Random number will be choosen from 1 to 100. Guess the number in 5 trails.");
		for (i = 1; i <= k; i++) {
			System.out.println("Guess the number:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if (n == num) {
				System.out.println("Wow...Perfect Guess..!!");
			} else if (n > num)
				System.out.println(n + " is greater than the actual number.");
			else if (n < num)
				System.out.println(n + " is lesser than the actual number.");

		}
		if (i == k + 1) {
			System.out.println("Sorry..You've exhausted " + k + " trails.");
			System.out.println("The actual number is " + num);
		}
	}

	public static void main(String args[]) {
		guess_the_number();
	}

}
