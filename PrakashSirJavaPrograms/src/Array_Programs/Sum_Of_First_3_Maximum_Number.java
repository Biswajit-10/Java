package Array_Programs;

public class Sum_Of_First_3_Maximum_Number {

	public static void main(String[] args) {
		int[] a= {30,10,40,60,20,50};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
