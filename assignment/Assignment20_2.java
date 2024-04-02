package assignment;

import java.util.Arrays;

public class Assignment20_2 {

	public static void main(String[] args) {
		String s=" Chandrakant!@$123  ";
		int charcount=0;
		int charcount1=0;
		int charcount2=0;
		
		char a[]=s.toCharArray();
		System.out.println(Arrays.toString(a));

		for(int i=0;i<a.length;i++) {
			boolean b=Character.isDigit(a[i]);

			if(b==true) {
				charcount++;
			//	System.out.println("These are the digits contain in the string "+i);
			}
		}
		System.out.println("Count of digits :"+charcount);
     for(int j=0;j<a.length;j++) {
    	 boolean c=Character.isAlphabetic(a[j]);
    	 if(c==true) {
    		// System.out.println("These are the alphabetes contain in the string "+j);
    		 charcount1++;
    	 }
     }
     System.out.println("Cout of Alphabetics :"+charcount1);
     
     for (int k=0;k<a.length;k++) {
    	boolean d= Character.isSpaceChar(a[k]);
    	if(d==true) {
    		//System.out.println("These are the spaces contain in the string "+k);
    		charcount2++;
    	}
     }
     System.out.println("Cout of Spaces :"+charcount2);
     
     int totallenghth=s.length();
     System.out.println("Total length of sum :"+totallenghth);
     int remsum=charcount+charcount1+charcount2;
     System.out.println("Addition of char, digits & spaces is :"+remsum);
     
     if (totallenghth==remsum) {
    	 System.out.println("Special character is not contain in the given string");
     }else {
    	 System.out.println("Special character is contain in the given string");
     }
	}

}
