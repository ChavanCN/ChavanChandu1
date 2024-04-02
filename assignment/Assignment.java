package assignment;

import java.util.Arrays;

public class Assignment {

	public static void main(String[] args) {
		int a[]=new int [4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
	   try {
		a[4]=50;
	   }catch(ArrayIndexOutOfBoundsException chavan) {
		   
	   }
		for(int i:a)
		System.out.println(i);
		
	}

}
