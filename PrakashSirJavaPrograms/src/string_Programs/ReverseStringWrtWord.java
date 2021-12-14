package string_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringWrtWord {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		String s="Hello this is java class is this java class";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		String[] a = rev.split(" ");
		ArrayList al=new ArrayList();
		for (String str : a) {
			al.add(str);
		}
		Collections.reverse(al);
		System.out.println(al);
	}
}

class ReverseStringWrtWord2 {
	public static void main(String[] args) {
		String s="Hello this is java class is this java class";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		String[] a = rev.split(" ");
		ArrayList<String> al=new ArrayList<>();
		for (String str : a) {
			al.add(str);
		}
		Collections.reverse(al);
		System.out.println(al);
     	a = (String[]) al.toArray();
     	rev="";
     	for(String b:a) {
     		rev=rev+b;
     	}
     	s=rev;
     	System.out.println(s);
	}
}