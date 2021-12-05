package ComeOnArray;
/*2. Declare an array, [1,4,3,5,2,2,-2,-2] with these numbers, get the pairs with sum =4
3. Declare an array, tell the odd indices and write code to print odd indices
*/
public class Sum4 {
	public static void main(String[] args) {
		int[] a= {1,4,3,5,2,2,-2,-2};
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==4) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
}
class PrintOddIndex{
	public static void main(String[] args) {
		int[] a= {1,4,3,5,2,2,-2,-2};
		for(int i=0;i<a.length;i++) {
			
				if(i%2!=0) {
					System.out.println(a[i]);
				}
		
		}
	}
}