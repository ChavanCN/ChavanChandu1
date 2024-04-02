package assignment;
abstract class parent1{
	abstract void add();
	abstract void sub();
	 void login() {
		System.out.println("login");
	}
}
abstract class parent2 extends parent1{
	abstract void mul();
	abstract void div();
	 void logout() {
			System.out.println("logout");
		}
}
public class Assignment16 extends parent2 {

	public static void main(String[] args) {
		Assignment16 a1=new Assignment16();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.login();
		a1.logout();
	}

	void mul() {
		System.out.println("Mul");
		
	}

	void div() {
		System.out.println("Div");
		
	}

	void add() {
		
		System.out.println("Add");
	}

	void sub() {
		System.out.println("Sub");
		
	}

}
