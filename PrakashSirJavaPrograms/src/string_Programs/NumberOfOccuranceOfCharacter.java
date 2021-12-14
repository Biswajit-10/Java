package string_Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class NumberOfOccuranceOfCharacter {
	public static void main(String[] args) {
		String s="chocolate";
		//step 1:-create set collection and add all the char of given string into set
		HashSet<Character> h=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			h.add(s.charAt(i));
		}
		//step 2:-compare each char of set with all the char of given string
		for (Character character : h) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(character==s.charAt(i))
		//step 3:-if char is matching increment the count
					count++;
			}
		//print both characters and count	
//			System.out.println(character+" is present "+count+" times");
			
			if(count>1) {
				System.out.println(character+" duplicate");
			}
//			if(count==1) {
//				System.out.println(character+" unique");
//			}
		}
	}
}
class RemoveDuplicate {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s="ciggarette";
		String s1="";
		Set<Character> h=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			h.add(s.charAt(i));
		}
		System.out.println(h);
//		for (Character character : h) {
//			int count=0;
//			for(int i=0;i<s.length();i++) {
//				if(character==s.charAt(i))
//					count++;
//			}
//	
//			if(count==1) {
//				s1=s1+(char)character;
//			}
//		}
//		s=s1;
//		System.out.println(s);
	}
}
