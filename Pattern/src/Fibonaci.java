import java.util.Scanner;
class Fibonaci{
	static int fib(int n){
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}

	public static void main(String[]args){
		System.out.println("enter the term you want to print the fibonaci");
		      Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(fib(a));
		//for(int i=0;i<=a;i++)
		//System.out.println(fib(i));
		sc.close();
	}
}
