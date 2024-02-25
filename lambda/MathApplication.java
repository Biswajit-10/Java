package lambda;

public class MathApplication {
	public static void main(String[] args) {
		
		MathOps addition= (a,b)-> a+b;
		MathOps substraction= (a,b)-> a-b;
		MathOps multiplication= (a,b)-> a*b;
		MathOps division= (a,b)-> a/b;
		
		System.out.println(addition.op(20, 10));
		System.out.println(substraction.op(20, 10));
		System.out.println(multiplication.op(20, 10));
		System.out.println(division.op(20, 10));
		
	}
}

@FunctionalInterface
interface MathOps{
	int op(int a,int b);
}