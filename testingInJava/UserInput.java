package testingInJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("unused")
public class UserInput {
	public static void main(String[] args) throws IOException {
		
	}
	
	private static void inputWithInputStream() throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);

		System.out.println("What is your name?");
		Object input = br.readLine();
		System.out.println("Your input was: " + input);
	}
	
}
