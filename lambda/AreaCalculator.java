package lambda;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {
	public static void main(String[] args) {
		List<Shape> shapes=new ArrayList<>();
		shapes.add(new Circle(2.5));
		shapes.add(new Square(5));
		shapes.add(new Rect(2,5));
		
		shapes.forEach(shape-> System.out.println(shape.calcualteArea()));
	}
}
@FunctionalInterface
interface Shape{
	double calcualteArea();
}


class Circle implements Shape{
	private double r;
	
	public Circle(double r) {
		this.r=r;
	}
	public double calcualteArea() {
		return Math.PI*r*r;
	}
}
class Square implements Shape{
	private double a;
	
	public Square(double a) {
		this.a=a;
	}
	public double calcualteArea() {
		return a*a;
	}
}
class Rect implements Shape{
	private double a;
	private double b;
	
	public Rect(double a,double b) {
		this.a=a;
		this.b=b;
	}
	public double calcualteArea() {
		return a*b;
	}
}
