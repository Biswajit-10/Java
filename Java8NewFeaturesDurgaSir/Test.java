package Java8NewFeaturesDurgaSir;

import java.util.function.*;

public class Test {
	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println("The Square of 15 is: "+f.apply(15));
		
		Predicate<Integer> p=i->i%2==0;
		System.out.println("Even: "+p.test(19));
		
		Function<String,Integer> strLength= str->str.length();
		System.out.println(strLength.apply("Hello"));
	}
}

/*
 *Predefined functional interfaces
 *Predicate
 *Function
 *Consumer
 *Supplier
 * etc.
 */
