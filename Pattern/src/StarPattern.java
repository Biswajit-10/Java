
public class StarPattern {

	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			for (int j =1; j <=4 ; j++) {
				if(i>=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
//			System.out.print("\n");
		}
	}
}
class pyram {
	
	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			for (int j =4; j >=1 ; j--) {
				if(i<j)
					System.out.print(" ");
				else
					System.out.print(" *");
			}
			System.out.println();
		}
	}
}
class StarPattern2 {

	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			for (int j =1; j <=4 ; j++) {
				if(i==1||i==4||j==1||j==4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
class StarPattern3 {
	
	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			for (int j =1; j <=4 ; j++) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}	
}
class StarPattern4 {
	
	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			for (int j =4; j>=1 ; j--) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}	
}
class StarPattern5 {
	
	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			for (int j =1; j<=4 ; j++) {
				if(i==5-j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}	
}
class StarPattern6 {
	
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j =1; j<=5 ; j++) {
				if(i==6-j)
					System.out.print("*");
				else if(i==j)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}	
}
class StarPattern7 {
	
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j =1; j<=5 ; j++) {
				if(i==6-j)
					System.out.print("*");
				else if(i==j)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}	
}
class FullPyramid {

	  public static void main(String[] args) {
	    int rows = 5, k = 0;

	    for (int i = 1; i <= rows; ++i, k = 0) {
	      for (int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }
	  }
	}