package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ExampleAnnotation {
	String value();

	int count() default 1;
}

//Use the annotation
class ExampleClass {
	@ExampleAnnotation(value = "Hello", count = 5)
	public void printMessage() {
		System.out.println("This is a message.");
	}
}

//Retrieve and process the annotation
public class Main {
	public static void main(String[] args) {
		ExampleClass example = new ExampleClass();
		Class<? extends ExampleClass> cls = example.getClass();

		// Retrieve the method annotations
		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(ExampleAnnotation.class)) {
				ExampleAnnotation annotation = method.getAnnotation(ExampleAnnotation.class);
				String value = annotation.value();
				int count = annotation.count();
				System.out.println("Value: " + value);
				System.out.println("Count: " + count);
			}
		}
	}
}
