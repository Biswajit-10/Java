package csvExp;

import java.util.Arrays;

public class SplitClass {
	public static void main(String[] args) {
		String s="a,,,,,,";
		String[] split = s.split(",",-1);
		System.out.println(Arrays.toString(split));
	}
}
