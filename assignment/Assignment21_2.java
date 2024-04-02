package assignment;

import java.util.Arrays;

public class Assignment21_2 {

	public static void main(String[] args) {
		String s="123c";
		int count=0;
		int lenghth=s.length();
		
		char a[]=s.toCharArray();
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			boolean x=Character.isDigit(a[i]);
			if(x==true) {
				count++;
			}
		}
		System.out.println("Counts of digits :"+count);
		if(lenghth==count) {
			System.out.println("This string does not contains any other charactes");
		}else {
			System.out.println("This string contains other charactes");
		}

	}

}
