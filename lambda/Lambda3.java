package lambda;

public class Lambda3 {
	public static void main(String[] args) {
		MyInterface m=()->System.out.println("Hello World");
		m.sayHello();
	}
	
}
interface MyInterface{
	void sayHello();
}