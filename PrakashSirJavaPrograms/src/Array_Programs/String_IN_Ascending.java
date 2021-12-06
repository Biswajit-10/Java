package Array_Programs;

import java.util.TreeSet;

public class String_IN_Ascending {

	public static void main(String[] args) {
		String[] s= {"Hello","This","Is","Java","Program"};
		TreeSet<String> set=new TreeSet<>();
		for (int i=0;i<s.length;i++) {
			set.add(s[i]);
		}
		for (String string : set) {
			System.out.println(string);
		}
	}
}
class Ascending{
		
	public static void main(String[] args){
			String[] s= {"Hello","This","Is","Java","Program"};
			for(int i=0;i<s.length;i++) {
				for(int j=i+1;j<s.length;j++) {
					if(s[i].compareTo(s[j])>0) {
						String temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				}
				System.out.print(s[i]+" ");				
			}
	
//			for(String str:s) {
//				System.out.print(str+" ");
//			}
					
	}
}
