package innerClasses;

public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		Popcorn p=new Popcorn() {
			public void taste() {
				System.out.println("sweety");
			}
		};
		p.taste();
		Popcorn p1=new Popcorn();
		p1.taste();
	}
}

class Popcorn{
	public void taste() {
		System.out.println("salty");
	}
}
