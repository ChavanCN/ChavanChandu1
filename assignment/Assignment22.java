package assignment;

import java.util.Arrays;

public class Assignment22 {

	public static void main(String[] args) {
		 Object a[]={"Roll No","  1","  2"};
		 Object b[]={"Student Name","Khushal","Khushal p"};
		for(Object i:a) {
			System.out.println(i);
		}
		for(Object i:b) {
			System.out.println(i);
		}
	 System.out.print(Arrays.toString(a)+Arrays.toString(b));

	}

}
