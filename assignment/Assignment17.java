package assignment;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	String input=s1.next();
	String output="";
	
	for(int i=input.length()-1;i>=0;i--) {
		output=output+input.charAt(i);
	}
    System.out.println(input);
	System.out.println(output);
	if(input.equals(output)) {
		System.out.println("The givem Stting is polindrome");
	}else {
		System.out.println("The givem Stting is not radatpolindrome");
	}
	}

}
