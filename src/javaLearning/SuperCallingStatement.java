package javaLearning;

public class SuperCallingStatement extends SuperCallingStatement1{

	public static void main(String[] args) {

		SuperCallingStatement mm= new SuperCallingStatement();
		
		
		
	}
	
public 	SuperCallingStatement() {


	System.out.println("SuperCallingStatement");
}


}

class SuperCallingStatement1{
	
	
	public SuperCallingStatement1() {
		this("rahul");
		System.out.println("implicit" );
		
	}
	
	public SuperCallingStatement1(String name) {
		this(10);
		System.out.println( name);
	}
	
	public SuperCallingStatement1(int value) {
		this(false);
		System.out.println(value);
	}
	public SuperCallingStatement1(boolean init) {
	
		System.out.println(init);
	}
}
