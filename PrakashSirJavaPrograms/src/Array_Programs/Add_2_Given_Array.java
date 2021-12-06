package Array_Programs;

public class Add_2_Given_Array {

	public static void main(String[] args) {
		int[] a= {30,10,40,60,20};
		int[] b= {30,10,40,60,20,50,70,80};
		int count=a.length;
		if(count<b.length) {
			count=b.length;
		}		
		for(int i=0;i<count;i++) {
			try {
				System.out.println(a[i]+b[i]);
			}
			catch (Exception e) {
				if(a.length>b.length)
					System.out.println(a[i]);
				else 
					System.out.println(b[i]);
			}
		}
	}
}

class Add_2_Given_Array2 {

	public static void main(String[] args) {
		int[] a= {30,10,40,60,20};
		int[] b= {30,10,40,60,20,50,70,80};
		if(a.length>b.length) {
			for(int i=0;i<a.length;i++) {
				if(i<b.length)
					System.out.println( a[i]+b[i]);	
				else		
					System.out.println(a[i]);	
			}							
		}
		else {
			for(int i=0;i<b.length;i++) {
				if(i<a.length)
					System.out.println( a[i]+b[i]);	
				else		
					System.out.println(b[i]);	
			}			
		}
	}
}

class Add_3_Given_Array {

	public static void main(String[] args) {
		int[] a= {30,10,40,60,20};
		int[] b= {30,10,40,60,20,50,70,80};
		int[] c= {30,10,40};
		@SuppressWarnings("unused")
		int count=a.length;
		int maxLength=a.length>b.length?(a.length>c.length?a.length:c.length):(b.length>c.length?b.length:c.length);
		System.out.println(maxLength);
//		if(count<b.length) {
//			count=b.length;
//		}		
//		for(int i=0;i<count;i++) {
//			try {
//				System.out.println(a[i]+b[i]);
//			}
//			catch (Exception e) {
//				if(a.length>b.length)
//					System.out.println(a[i]);
//				else 
//					System.out.println(b[i]);
//			}
//		}
	}
}
