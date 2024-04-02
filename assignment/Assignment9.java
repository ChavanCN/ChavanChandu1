package assignment;

import java.util.Scanner;

public class Assignment9 {
  final static float pia=3.14f;
   
   public void AreaofCircle() {
	   Scanner s1=new Scanner(System.in); 
	  int r= s1.nextInt();
	  double area=pia*(r*r);
	  System.out.println(area);
   }
 public void AreaofCircle1() {
	 Scanner s2=new Scanner(System.in);
	 double r2=s2.nextDouble();
	 double area1=pia*(r2*r2);
	 System.out.println(area1);
   }
   
    
	public static void main(String[] args) {
		Assignment9 a1=new Assignment9();
		a1.AreaofCircle();
		a1.AreaofCircle1();

	}

}
