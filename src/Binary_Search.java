import java.util.Scanner;

public class Binary_Search {
	public static void main(String args[]) {
		int i, j, a[] = { 5, 8, 10, 4, 3, -2, 2, 9, 1 };
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		System.out.print("Sorted Array: [");
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.print("]");
		System.out.println();
		System.out.println("Enter a number you want to search:");
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int start = 0, last = a.length - 1;
			int flag = 0;
			while (start <= last) {
				int mid = (start + last) / 2;
				if (n == a[mid]) {
					System.out.println(n + " found at index " + mid);
					flag = 1;
					break;
				} else if (n > a[mid])
					start = mid + 1;
				else
					last = mid - 1;
			}
			if (flag == 0)
				System.out.println(n + " not found in the array");
		}
	}

}
