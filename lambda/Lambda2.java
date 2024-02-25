package lambda;

public class Lambda2 {
	public static void main(String[] args) {
		// Example 1: Addition of two numbers
		MathOperation addition = (a, b) -> a + b;
		int result = addition.operation(5, 3);  // Output: 8
		System.out.println(result);
		
		// Example 2: Check if a number is even
		NumberChecker isEven = (num) -> num % 2 == 0;
		boolean even = isEven.check(10);  // Output: true
		System.out.println(even);

		// Example 3: Find the maximum number in an array
		ArrayProcessor maxNumber = (arr) -> {
		    int max = arr[0];
		    for (int i = 1; i < arr.length; i++) {
		        if (arr[i] > max) {
		            max = arr[i];
		        }
		    }
		    return max;
		};
		int[] numbers = {4, 2, 9, 6, 7};
		int maxValue = maxNumber.process(numbers);  // Output: 9
		System.out.println(maxValue);

	}
}

@FunctionalInterface
interface MathOperation{
	 int operation(int n1,int n2);
}

@FunctionalInterface
interface NumberChecker{
	boolean check(int a);
}	

@FunctionalInterface
interface ArrayProcessor{
		int process(int[] a);
}
