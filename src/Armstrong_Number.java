import java.util.ArrayList;
import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String args[]) {
		int i,n;
		System.out.println("Enter a number:");
		try (Scanner sc = new Scanner(System.in)) {
			n=sc.nextInt();
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		int tmp_n=n;
		while(tmp_n!=0) {
			int rem=tmp_n%10;
			al.add(rem);
			tmp_n=tmp_n/10;
		}
		System.out.println(al);
		int sum=0;
		for(i=0;i<al.size();i++) {
			sum=sum+(int)Math.pow(al.get(i),al.size());
		}
		if(n==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}

}
