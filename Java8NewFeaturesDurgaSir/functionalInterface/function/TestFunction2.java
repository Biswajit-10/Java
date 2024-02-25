package Java8NewFeaturesDurgaSir.functionalInterface.function;

import java.util.function.Function;

public class TestFunction2 {
	public static void main(String[] args) {
		Function<Student,String> f=s->{
			int marks=s.marks;
			String grade="";
			if(marks>80) grade="A";
			else if(marks>60) grade="B";
			else if(marks>40) grade="C";
			else grade="F";
			return grade;
		};
		String result = f.apply(new Student("Sunil",50));
		System.out.println(result);
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
