package javaLearning;

public class MethodOverloadingConcept {

	public static void main(String[] args) {
	
		MethodOverloadingConcept mm=new MethodOverloadingConcept();
mm.m1();
mm.m1(32746474844l);

	}
	
	public static void main() {
		
		MethodOverloadingConcept mm=new MethodOverloadingConcept();
mm.m1();
mm.m1(32746474844l);

	}
public static void main(int a) {
		
		MethodOverloadingConcept mm=new MethodOverloadingConcept();
mm.m1();
mm.m1(32746474844l);

	}
	
public void m1() {
		
		System.out.println("this is non parmeterised method");
		
	}
public void m1(int a) {
	
	System.out.println("this is parametrised method for String" +a );
	
}

public void m1(boolean a) {
	int b=10;
	System.out.println("this is parametrised method for boolean" + a);
	
}
public void m1(long bb ) {
	
	System.out.println("this is parametrised method for double" + bb);
	
}



}
