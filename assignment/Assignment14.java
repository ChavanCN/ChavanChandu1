package assignment;
class class1{
	void m1() {
		System.out.println("Method 1");
	}
}
class class2 extends class1{
	void m2() {
		System.out.println("Method 2");
	}
}
class class3 extends class2{
	void m3() {
		System.out.println("Method 3");
	}
}
class class4 extends class3{
	void m4() {
		System.out.println("Method 4");
	}
}
class class5 extends class4{
	void m5() {
		System.out.println("Method 5");
	}
}
public class Assignment14 extends class5{
void m6() {
	System.out.println("Method 6");
}
	public static void main(String[] args) {
		Assignment14 a1=new Assignment14();
		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();
		a1.m5();
		a1.m6();
		

	}

}
