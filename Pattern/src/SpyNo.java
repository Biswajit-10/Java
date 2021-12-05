//A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits
//A neon number is a number where the sum of digits of square of the number is equal to the number
// a happy number is a number which eventually reaches 1 when replaced by the sum of the square of each digit
// number that is the sum of its own digits each raised to the power of the number of digits
import java.util.Scanner;
class SpyNo
{
	static void armstrong(int a)
	{
		int b=noOfDigit(a);
		int temp=a;
		int sum=0;
		while(a>0)
		{
			int d=a%10;
		//	int result=1;
		/*	while(b>0)
			{
				result=result*d;
				b--;
				System.out.println(result);
			}
			sum=sum+result;*/
			a=a/10;
		    sum=sum+(int)(Math.pow(d,b));//power method return type is double
		}
		System.out.println(temp+" "+sum);
		if(temp==sum)
			System.out.println(temp+" is a armstrong number");
		else
			System.out.println(temp+" is not a armstrong number");
	}
	static int noOfDigit(int a)
	{
		int count=0;
		while(a>0)
		{
		int d=a%10;
		a=a/10;
		count++;
	    }
		return count;
	}
	static String happyNumber(int a)
	{
	//	int no=a;
		while(a>9)
		{
		a=sumSquare(a);	
		}
		if(a==1)
		    return "happy number";
		else
			return "sad number";
	}
	static int sumDig(int a)
	{
		int sum=0;
		while(a>0)
		{
		int d=a%10;
		sum=sum+d;
		a=a/10;
	    }
		return sum;
	}	
	static int productDig(int a)
	{
		int product=1;
		while(a>0)
		{
		int d=a%10;
		product=product*d;
		a=a/10;
	    }
		return product;
	}
	static int sumSquare(int a)
	{
		int sum=0;
		while(a>0)
		{
		int d=a%10;
		sum=sum+d*d;
		a=a/10;
	    }
		return sum;
	}
	public static void main(String[] args)
	{
	/*	Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
	    if(sumDig(a)==productDig(a))
            System.out.println("spy number");
        else
            System.out.println("not a spy number");			
	    if(a==sumSquare(a))
			System.out.println("neon number");	
			System.out.println("not a neon number");		
		System.out.println(happyNumber(49));*/
	    armstrong(9474); 
			System.out.println(noOfDigit(13007824));		
	}
}