package assignment;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int cas =s1.nextInt();
	
	switch(cas) {
	case 1:
		System.out.println("Addition");
		break;
	case 2:
		System.out.println("Substration");
		break;
	case 3:
		System.out.println("Multification");
		break;
	case 4:
		System.out.println("Division");
		break;
	case 5:
		System.out.println("Modulus");
		break;
		default:
			System.out.println("Invalid Operatoe");
		
	}
	}
	}
	
	
