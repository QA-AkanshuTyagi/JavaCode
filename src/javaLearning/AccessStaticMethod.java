package javaLearning;

public class AccessStaticMethod {

	public static void main(String[] args) {
int a=10;
System.out.println(a);
		AccessStaticMethod mm=new AccessStaticMethod();//object creation
		mm.m1();
		mm.m2();
		m2();
	}
	public  void m1() {
		
		System.out.println("this is non static method");
		
	}
	
	public static void m2() {
		
		System.out.println("this is static method");

		
	}

}
