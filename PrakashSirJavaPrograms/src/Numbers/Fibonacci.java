package Numbers;

	public class Fibonacci {

		public static void main(String[] args) {
			
			int n1=0;
			int n2=1;
			int n3;
			    
			System.out.println(n1+"\n"+n2);//printing 0 and 1    
			
//			loop starts from 2 because 0 and 1 are already printed 8 time runs and return 8 numbers		
			
			 for(int i=2;i<10;i++)   
			 {    
			  n3=n1+n2;    
			  System.out.println(n3);    
			  n1=n2;    
			  n2=n3;    
			 }    
		}

	}

