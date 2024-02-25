package annotation;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationApplication {
	
	@MyAnnotations(author= {Author.MILU}, envType = {envType.QA})
	
	void m1() throws  NoSuchMethodException, SecurityException, ClassNotFoundException {
		Class<AnnotationApplication> c=AnnotationApplication.class;
		Method method = c.getDeclaredMethod("m1");
		MyAnnotations annotation = method.getAnnotation(MyAnnotations.class);
		envType[] env = annotation.envType();
		System.out.println(Arrays.toString(env));
	}
	               
	public static void main(String[] args) throws  NoSuchMethodException, SecurityException, ClassNotFoundException {
		AnnotationApplication a=new AnnotationApplication();
		a.m1();
	}
}
