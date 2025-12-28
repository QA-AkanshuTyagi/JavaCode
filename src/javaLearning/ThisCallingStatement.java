package javaLearning;

public class ThisCallingStatement extends ThisCallingStatement11{

	public static void main(String[] args) {

		ThisCallingStatement mmm= new ThisCallingStatement();
		
	}
	
public 	ThisCallingStatement() {
super();
	System.out.println("SuperCallingStatement");
}


}

class ThisCallingStatement11{
	
	
	
	public ThisCallingStatement11() {
		this(10);
		System.out.println("implicit" );
	}
	public ThisCallingStatement11(int value) {
		this(false);

		System.out.println("implicit" +value);
	}
	public ThisCallingStatement11(boolean init) {
		
		System.out.println("implicit" +init);
	}
}
