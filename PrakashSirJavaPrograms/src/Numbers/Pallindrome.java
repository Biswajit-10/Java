package Numbers;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter a no ");
		int a=s.nextInt();
		s.close();
		int rev=0;
		int temp=a;

		while(a>0)
		{
			int d= a%10;
			rev=rev*10+d;
			a=a/10;
		}
		if(temp==rev)
		{
			System.out.println("pallindrome");
		}
		else
			System.out.println("not a pallindrome");

	}

}
