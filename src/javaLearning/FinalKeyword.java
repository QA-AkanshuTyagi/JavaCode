package javaLearning;

public class FinalKeyword extends FinalKeyword2{
	
	final  String a="ramchandra";
	public   void m11() {
	
		System.out.println("hello111");
		
		
	} 

	public static void main(String[] args) {
		
		FinalKeyword mm= new FinalKeyword();
		mm.m1();

	}

}

 class FinalKeyword2{


	public  final  void m1() {
		
		System.out.println("hello");
		
		
	}
	class InheritanceConcept2 extends InheritanceConcept1{
		

		public void m1() {
			
			System.out.println("hello");
			
			
		}
	
	
	
}
}