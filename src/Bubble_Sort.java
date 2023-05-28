
public class Bubble_Sort {
	public static void main(String args[]) {
		int a[]= {5,4,3,2,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<=i;j++) {
				if(a[i]>a[j]) {
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
		System.out.println(a);
	}
}
