package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOfWords {
	final static String REGEX="((john) (.+?)) ";
	final static String input="john writes about this, and john doe writes about that. and john wayne writes about everything.";
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(REGEX,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		int count=0;
		
		while(matcher.find()) {
			count++;
//			System.out.println(matcher.group(0));
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			System.out.println(matcher.group(3));
		}
		System.out.println(count);
	}
}
