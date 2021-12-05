
public class Triangle{
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j =1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}
class InvertedTriangle{
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j =5; j>=i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}
class MirrorTriangle{
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j =4; j>=i ; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*");	// " *" --> pyramid 
			}
			System.out.println();
		}
	}	
}
class MirrorInvertedTriangle{
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			//space is increasing
			for (int j =1; j<i ; j++) {
				System.out.print(" ");
			}
			//star is decreasing
			for (int k = 5; k >=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}
class m{
	public static void main(String[] args) {
		MirrorTriangle.main(null);
		MirrorInvertedTriangle.main(null);
	}	
}
class Pyramid{
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j =5; j>=i ; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}	
}
