package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Shift {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int key=1;
		int[] a= {30,10,40,60,20,50,70,80};
		int temp=a[0];
		for(int i=0;i<a.length-1;i++) {
			
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
	}
}
class Shift2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int[] a= {30,10,40,60,20,50,70,80};
		for(int j=0;j<key;j++) {
			int temp=a[0];
		for(int i=0;i<a.length-1;i++) {

			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
	}	
		System.out.println(Arrays.toString(a));
		sc.close();
	}
}
