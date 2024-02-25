package innerClasses.DefineInsideMethodArgument;

public class MethodArgs {
	public static void main(String[] args) {
		Cow cow=new Cow(new Animal() {
			@Override
			public void sound() {
				System.out.println("Animal Sound");
			}
		});
		cow.sound();
	}
}

class Cow implements Animal{
	Animal animal;
	Cow(Animal animal){
		System.out.println("Cow");
		this.animal=animal;
	}
	public void sound() {
		System.out.println(animal);
		animal.sound();
	}
}

interface Animal{
	void sound();
}