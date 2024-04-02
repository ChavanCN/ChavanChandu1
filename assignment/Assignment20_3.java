package assignment;

import java.util.Arrays;

public class Assignment20_3 {

	public static void main(String[] args) {
		String s="Chandrakant 123 ";
		int digit=0;
		int charc=0;
		int spaces=0;
		
		char a[]=s.toCharArray();
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
		boolean x=	Character.isDigit(a[i]);
		boolean y=Character.isAlphabetic(a[i]);
		boolean z=Character.isSpaceChar(a[i]);
		
		if(x==true) {
			digit++;
			//System.out.println(digit);
		}else if(y==true) {
		charc++;
		//System.out.println(charc);
		}else if(z==true){
			spaces++;
			//System.out.println(spaces);
		}
		}
		System.out.println(digit);
		System.out.println(charc);
		System.out.println(spaces);
		int length=s.length();
		int rem =digit+charc+spaces;
		if (length==rem) {
			System.out.println("This string does not contain special char");
		}else {
			System.out.println("This string contains special char");
		}
	}

}
