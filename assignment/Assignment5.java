package assignment;

public class Assignment5 {
	Assignment5(){
		System.out.println("Constructor 1");
	}
Assignment5(int a){
	System.out.println("Constructor 2");
	}
Assignment5(int a,char c){
	System.out.println("Constructor 3");
}
Assignment5(double d,float f){
	System.out.println("Constructor 4");
}
Assignment5(String s){
	System.out.println("Constructor 5");	
}
Assignment5(boolean b){
	System.out.println("Constructor 6");
}
	public static void main(String[] args) {
	new Assignment5();
	new Assignment5(10);
	new Assignment5(10,'A');
	new Assignment5(12.663,36788.89f);
	new Assignment5("Chnadu");
	new Assignment5(false);

	}

}
