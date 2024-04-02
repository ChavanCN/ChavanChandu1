package assignment;

import java.util.Arrays;

public class Assignment21_1 {

	public static void main(String[] args) {
		String s="Chandrakant123";
		int count=0;
		int length1=s.length();

		char a[]=  s.toCharArray();
		System.out.println(Arrays.toString(a));

		for(int i=0;i<a.length;i++) {
			boolean x= Character.isAlphabetic(a[i]);
			if(x==true) {
				count++;
			}
		}
		System.out.println("total cont of ablpahbets :"+count);
        if (length1==count) {
        	System.out.println("This string does contains not other character");
        }else {
        	System.out.println("This string contains other character");
        }
	}

}
