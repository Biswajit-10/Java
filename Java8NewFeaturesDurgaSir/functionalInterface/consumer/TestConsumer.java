package Java8NewFeaturesDurgaSir.functionalInterface.consumer;

import java.util.function.Consumer;

public class TestConsumer {
	public static void main(String[] args) {
		Consumer<String> c= s-> System.out.println(s);
		c.accept("Hello World !!!"+"\n");

		Consumer<Student> cons= s->{
			System.out.println(s.name);
			System.out.println(s.marks);
		};
		
		cons.accept(new Student("Biswajit",40));
	}
}

class Student{
	String name;
	int marks;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
}
