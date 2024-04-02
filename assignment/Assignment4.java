package assignment;

public class Assignment4 {
public static void add() {
	System.out.println("Add");
}
public static void sub() {
	System.out.println("Sub");
}
public  void mul() {
	System.out.println("Mul");
}
public  void div() {
	System.out.println("Div");
}
	public static void main(String[] args) {
	add();
	sub();
	Assignment4 a1=new Assignment4();
	a1.mul();
	a1.div();
	//new Assignment4().mul();
	//new Assignment4().div();

	}

}
