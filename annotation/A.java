package annotation;

import java.lang.reflect.Method;

public class A {

    @MyAnnotations(author = {Author.MILU}, envType = {envType.QA})
    void m1() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        Class<A> c = A.class;
        
        Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(MyAnnotations.class)) {
				MyAnnotations annotation = method.getAnnotation(MyAnnotations.class);
				envType[] value = annotation.envType();
				System.out.println("Value: " + value);
				Author[] author = annotation.author();
				System.out.println("Author: " + author);
			}
		}
//		  Method method = c.getDeclaredMethod("m1");
//        MyAnnotations annotation = method.getAnnotation(MyAnnotations.class);
//        envType[] env = annotation.envType();
//        System.out.println(Arrays.toString(env));
    }

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        A a = new A();
        a.m1();
    }
}
