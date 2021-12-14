package string_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWithout3rd {
	public static void main(String[] args) {
		String s="tyss";
		for(int i=s.length()-1;i>=0;i--)
				System.out.print(s.charAt(i));
	}
}
class ReverseWith_3rd_variable {
	public static void main(String[] args) {
		String s="tyss";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
class Reverse_Without_using_Length_Method{
	public static void main(String[] args) {
		String s="tyss";
		String rev="";
		int length=s.compareTo("");
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
class Reverse2 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		String s="tyss";
		char[] ch = s.toCharArray();
		List l=new ArrayList();
		for (char c : ch) {
			l.add(c);
		}
		Collections.reverse(l);
//		System.out.println(l);
		int i=0;
		for (Object object : l) {
			char c=(Character)object; 
			ch[i]=c;
			i++;
		}
		s=new String(ch);
		System.out.println(s);
	}
}

