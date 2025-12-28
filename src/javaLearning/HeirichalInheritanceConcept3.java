package javaLearning;

public class HeirichalInheritanceConcept3 extends ParentClass11{
	

	public void m11() {
	
		System.out.println("hello1");
		
		
	} 

	public static void main(String[] args) {
		
		HeirichalInheritanceConcept3 mm= new HeirichalInheritanceConcept3();
		mm.m1();
		

	}

}

class ParentClass11 {
	

	public  void m1() {
		
		System.out.println("hello2");
		
		
	}
}
	class child11 extends ParentClass11 {
		

		public void m3() {
			
			System.out.println("hello3");
			
			
		}
	
	
	
}
