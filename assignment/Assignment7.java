package assignment;

import java.util.Scanner;

public class Assignment7 {
	public static void add() {
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b= s1.nextInt();
		int sum=a+b;
		System.out.println(sum);
	}
	public static void sub() {
		Scanner s2=new Scanner(System.in);
		int a=s2.nextInt();
		int b=s2.nextInt();
		int sub=b-a;
		System.out.println(sub);
	}
	public static void mul() {
		Scanner s3=new Scanner(System.in);
		int a=s3.nextInt();
		int b=	s3.nextInt();
		int mul=b*a;
		System.out.println(mul);
	}
	public static void div() {
		Scanner s4=new Scanner(System.in);
		int a=s4.nextInt();
		int b=s4.nextInt();
		int div=b/a;
		System.out.println(div);
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();

	}

}
