package Numbers;

import java.util.Scanner;

public class Reverse_A_Number {
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter a no ");
		int a=s.nextInt();
		s.close();
		int rev=0;

		while(a>0)
		{
			int d= a%10;
			rev=rev*10+d;
			a=a/10;
			System.out.println(rev);
		}
		//System.out.println(rev);

	}
}
