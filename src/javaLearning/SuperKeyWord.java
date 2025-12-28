package javaLearning;

public class SuperKeyWord extends SuperKeyWord1{

	public static void main(String[] args) {
		SuperKeyWord ss= new SuperKeyWord();	
		SuperKeyWord1 ss1= new SuperKeyWord1();
ss.m1();

	}
	
	public  void m1() {
		System.out.println("child");
		super.m1();
	}

}

	
