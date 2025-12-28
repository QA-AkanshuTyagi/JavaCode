package javaLearning;

public class InheritanceConcept extends InheritanceConcept1{
	

	public void m1() {
		
		System.out.println("hello");
		
		
	} 

	public static void main(String[] args) {
		
		InheritanceConcept mm= new InheritanceConcept();
		mm.m1();

	}

}

class InheritanceConcept1{
	

	public void m1() {
		
		System.out.println("hello");
		
		
	}
	class InheritanceConcept2 extends InheritanceConcept1{
		

		public void m1() {
			
			System.out.println("hello");
			
			
		}
	
	
	
}
}