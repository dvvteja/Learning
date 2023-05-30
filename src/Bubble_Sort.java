import java.util.Scanner;

public class Bubble_Sort {
	public static void main(String args[]) {
		int i,j;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Array Size:");
			int n=sc.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}		
			for(i=0;i<n;i++) {
				for(j=0;j<n-1;j++) {
					if(a[j]>a[j+1]) {
						int tmp=a[j];
						a[j]=a[j+1];
						a[j+1]=tmp;
					}
				}
			}
			System.out.println("Array Elements are:");
			for(i=0;i<n;i++) {
				System.out.println(a[i]);
			}
		}
	}
}
