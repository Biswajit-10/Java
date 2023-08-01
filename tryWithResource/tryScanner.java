package tryWithResource;

import java.util.Scanner;

public class tryScanner {
	public static void main(String[] args) {
		
        try (Scanner sc = new Scanner(System.in)) {
            // Code to execute when the resource is available
            
            // Example: Reading input from the user
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "!");
            
            // TODO: Add your program's logic here
            
            // The resource (Scanner) will be automatically closed after this block
        }
        
    }
}
