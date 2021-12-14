package Array_Programs;

import java.time.LocalDate;
import java.util.Arrays;

public class ShiftAll_Numbers_To_Last_Index {

	public static void main(String[] args) {
		int[] a= {1,0,0,1,0,1,2};
		int[] b=new int[a.length];
		int j=a.length-1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[j]=a[i];
				j--;
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
class TomorrowDate{
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now().plusDays(1);
		System.out.println(date);
		
		System.out.println(date.getDayOfWeek());
	}
}