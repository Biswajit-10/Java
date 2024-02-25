package innerClasses;

//Noramal or Regular Inner Class
//we can't invoke normal inner class from cmd

public class RegularInnerClass {
	class InnerClass{
		int a=10;
		public void run() {
			System.out.println("run");
			outerClassMethod();
			outerClassStaticMethod();
		}
	}
	public void a() {
		InnerClass in=new InnerClass();		
		in.run();
		in.run();
	}
	public static void main(String[] args) {
		RegularInnerClass r=new RegularInnerClass();
		r.a();
	}
	public static void outerClassStaticMethod() {
		System.out.println("Outer class static Method");
	}
	public void outerClassMethod() {
		System.out.println("Outer class Method");
	}
}

/*
public class RegularInnerClass {
	class InnerClass{
		static int a=10;
		public static void main(String[] args) {
			
		}
	}
}
*/