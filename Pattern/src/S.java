import java.util.Scanner;
class Sum_Using_Recursion{
	static int sum(int n){
		if(n==1){
		return 1;}
	return n+sum(n-1);
}
		
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a digit : ");
	int a=sc.nextInt();
	//int b=sum(a);
	//System.out.println(b);
	System.out.println(sum(a));
	//sum(a);   //NOT WORKING , WHY
}
}