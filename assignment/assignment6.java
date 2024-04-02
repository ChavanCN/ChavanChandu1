package assignment;

public class assignment6 {
   static//SIB block
   {
	   System.out.println("This is SIB block");
   }
   {//IIB
	   System.out.println("This is IIB block"); 
   }
   assignment6(){
	   System.out.println("This constructor");
   }
	
   
	public static void main(String[] args) {
		System.out.println("This is Main method");
		new assignment6 ();

	}

}
