package Java8NewFeaturesDurgaSir.functionalInterface.function;

import java.util.function.*;

public class TestFunction {
	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println("The Square of 15 is: "+f.apply(15));
		
		Function<String,Integer> strLength= str->str.length();
		System.out.println(strLength.apply("Hello"));
	}
}
