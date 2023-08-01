package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SquareBracket {
	
	public static void main(String[] args) {
		String regEx="[f-l[p-v]]";
		String match="q";
		
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(match);
		boolean result = matcher.matches();
		System.out.println(result);
	}
	
}
