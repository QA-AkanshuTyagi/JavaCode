package javaLearning;

public class ConstructorConcept {

	public static void main(String[] args) {
	
		
		ConstructorConcept cc= new ConstructorConcept();
		
		ConstructorConcept cc1= new ConstructorConcept("jeff");
		ConstructorConcept cc2= new ConstructorConcept(12);
		ConstructorConcept cc3= new ConstructorConcept(true);

	}
	
	
public ConstructorConcept() {
	
	System.out.println("const ");
	
	
}
public ConstructorConcept(String bac) {
	
	System.out.println("String const ");
	
}
public ConstructorConcept(int cab) {
	
	System.out.println(" int const ");
	
}
public ConstructorConcept(boolean ab) {
	
	System.out.println("boolean const ");
	
}
}
