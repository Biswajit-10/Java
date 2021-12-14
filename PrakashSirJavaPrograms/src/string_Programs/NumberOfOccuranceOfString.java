package string_Programs;

import java.util.HashSet;

public class NumberOfOccuranceOfString {
	public static void main(String[] args) {
		String s="Hello this is java class is this java class";
		String[] a = s.split(" ");
//		System.out.println(Arrays.toString(a));
		HashSet<String> set=new HashSet<>();
		for(String st:a) {
			set.add(st);
		}
//		System.out.println(set);
		for ( String str: set) {
			int count=0;
			for(String st:a) {
				if(str.equals(st))
					count++;
			}			
			System.out.println(str+" "+count);
		}
		
	}
}

class PrintDuplicate {
	public static void main(String[] args) {
		String s="Hello this is java class is this java class";
		String[] a = s.split(" ");
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		
		for ( String str: set) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(str.equals(a[i]))
					count++;
			}	
			if(count>1)
			System.out.println(str+" "+count);
		}
		
	}
}
class PrintDuplicate2 {
	public static void main(String[] args) {
		String s="Hello this is java class is this java class is";
		String[] a = s.split(" ");
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(set.add(a[i])==false) {
				System.out.println(a[i]);
			}
		}		
	}
}
class UniqueWord {
	public static void main(String[] args) {
		String s="Hello this is java class is this java class";
		String[] a = s.split(" ");
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		
		for ( String str: set) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(str.equals(a[i]))
					count++;
			}	
			if(count==1)
				System.out.println(str+" "+count);
		}
		
	}
}
class RemoveDuplicateWord {
	public static void main(String[] args) {
		String s="Hello this is java bye class is this java class hi";
		String s1="";
		String[] a = s.split(" ");
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		
		for ( String str: set) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(str.equals(a[i]))
					count++;
			}	
			if(count==1)
				s1=s1+" "+str;
		}
		s1=s1.trim();
		System.out.println(s1);
	}
}
