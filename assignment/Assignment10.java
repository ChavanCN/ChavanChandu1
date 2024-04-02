package assignment;

import java.util.Scanner;

public class Assignment10 {
   final static double pia=3.14;
   
	void circumfrance() {
	Scanner s1=new Scanner(System.in);
   double radious= s1.nextDouble();
   double circum=(2*pia*radious);
   System.out.println(circum);
	}
	public static void main(String[] args) {
		new Assignment10().circumfrance();

	}

}
