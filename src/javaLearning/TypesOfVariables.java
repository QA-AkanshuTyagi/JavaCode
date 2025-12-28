package javaLearning;

public class TypesOfVariables {
    String url="https://www.fb.com"; //final variable
	static int b=120;
   
   
   public static void main(String[] args) {
		TypesOfVariables mm= new TypesOfVariables();
		
		b=210;
		mm.m2();
		;
	System.out.println(b);
	
	
	
	
	
	}
	
	public static void m2() {
		TypesOfVariables mm1= new TypesOfVariables();
System.out.println(mm1.b);
	b=11;	
	
	}
	
public void m3() {
		
		
	}
	
}
