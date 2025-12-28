package javaLearning;

public class ThisKeyword {
String name="akanshu";
int value=10;
	public static void main(String[] args) {
		ThisKeyword ss= new ThisKeyword();	
ss.m1();
	}
	
	


	
	public  void m1() {
		 name="rahul";
		int value= 11;
		
		
		System.out.println(this.name);
System.out.println(this.value);

	}
	
	
}