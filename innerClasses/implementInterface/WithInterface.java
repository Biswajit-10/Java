package innerClasses.implementInterface;

public class WithInterface {
	
	public static void main(String[] args) {
		Human human=new Human() {
			@Override
			public void sing() {
				System.out.println("Can Sing");
			}
			@Override
			public void eat() {
				System.out.println("Can Eat");
			}
			@Override
			public void sleep() {
				System.out.println("Can sleep");
			}
		};
		human.sing();
		human.eat();
		human.sleep();
	}
}

interface Human{
	 void sing();
	 void eat();
	 void sleep();
}
