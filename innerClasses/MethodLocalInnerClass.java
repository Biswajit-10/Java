package innerClasses;

public class MethodLocalInnerClass {

	public void m1() {
		class Inner{
			public void sum(int a,int b) {
				System.out.println(a+b);
			}
		}
		Inner i=new Inner();
		i.sum(10, 20);
		i.sum(50, 100);
		i.sum(100, 200);
	}
	public static void main(String[] args) {
		MethodLocalInnerClass mli=new MethodLocalInnerClass();
		mli.m1();
	}
	
}
