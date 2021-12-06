package Numbers;

import java.util.Scanner;

public class AddDigits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=s.nextInt();
		s.close();
		int sum=0;
		while(a>0)
		{
			int d=a%10;
			sum=sum+d;
			a=a/10;
		}
		System.out.println(sum);
     
	}
}
class No_Of_Digits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=s.nextInt();
		s.close();
		int count=0;
		while(a>0)
		{
			count++;
			a=a/10;
		}
		System.out.println(count);
		
	}
}
class No_Of_Digits2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=s.nextInt();
		s.close();
		String number=String.valueOf(a);
		System.out.println(number.length());
	}
}
