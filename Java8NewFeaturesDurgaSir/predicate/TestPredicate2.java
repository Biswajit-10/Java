package Java8NewFeaturesDurgaSir.predicate;

import java.util.function.Predicate;

public class TestPredicate2 {
	public static void main(String[] args) {
		String[] str= {"Dhoni","Sachin","Virat","Gambhir","Raina"};
		Predicate<String> pred= s->s.length()>5;
		
		for (String string : str) {
			System.out.println(string+" : "+pred.test(string));
		}
	}
}
