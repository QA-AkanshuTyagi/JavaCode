package javaLearning;

public class MultiLevelInheritanceConcept2 extends ParentClass1{
	

	public void m11() {
	
		System.out.println("hello1");
		
		
	} 

	public static void main(String[] args) {
		
		MultiLevelInheritanceConcept2 mm= new MultiLevelInheritanceConcept2();
		mm.m1();
		mm.m3();

	}

}

class ParentClass1 extends child{
	

	public  void m1() {
		
		System.out.println("hello2");
		
		
	}
}
	class child {
		

		public void m3() {
			
			System.out.println("hello3");
			
			
		}
	
	
	
}
