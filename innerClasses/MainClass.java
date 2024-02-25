package innerClasses;

public class MainClass {
	public static void main(String[] args) {
		RegularInnerClass r=new RegularInnerClass();
//		r.InnerClass
		RegularInnerClass.InnerClass innerClass = r.new InnerClass();
		innerClass.run();
		System.out.println(innerClass.a);
	}
}
