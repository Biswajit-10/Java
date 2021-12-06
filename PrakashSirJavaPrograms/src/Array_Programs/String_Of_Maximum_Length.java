package Array_Programs;

public class String_Of_Maximum_Length {
	public static void main(String[] args) {
		String[] str= {"Hello","ramdash","This","Is","Java","Program"};
		int maxLength=str[0].length();

		for(int i=1;i<6;i++) {
			if(maxLength<str[i].length()) {
				maxLength=str[i].length();
			}
		}
		for(String s:str) {
			if(s.length()==maxLength) {
				System.out.println(s);
			}
		}

	}
}
class With{
	public static void main(String[] args) {
		String[] str= {"Hello","ramdash","This","Is","Java","Program"};
		String max=str[0];

		for(int i=1;i<str.length;i++) {
			if(max.length()<str[i].length()) {
				max=str[i];
			}
		}
		for(String s:str) {
			if(s.length()==max.length()) {
				System.out.println(s);
			}
		}
	}
}
class Sort_String_IN_Descending_LengthWise {
	
	public static void main(String[] args) {
		
		String[] s= {"Hello","This","Is","b","Java","Program","a"};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].length()<s[j].length()) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			System.out.println(s[i]);
		}
	}
}
