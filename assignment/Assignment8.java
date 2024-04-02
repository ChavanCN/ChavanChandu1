package assignment;

import java.util.Scanner;

public class Assignment8 {
  static Scanner s1=new Scanner(System.in);
  static int a=s1.nextInt();
  static int b=s1.nextInt();
  public void add() {
	  int add=a+b;
	  System.out.println(add);
  }
  public void sub() {
	  int sub=b-a;
	  System.out.println(sub);
  }
  public void mul() {
	  int mul=a*b;
	  System.out.println(mul);
  }
  public void div() {
	  int div=b/a;
	  System.out.println(div);
  }
	public static void main(String[] args) {
		new Assignment8().add();
		new Assignment8().sub();
		new Assignment8().mul();
		new Assignment8().div();

	}

}
