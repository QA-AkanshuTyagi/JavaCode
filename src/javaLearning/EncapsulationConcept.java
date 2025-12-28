package javaLearning;

public class EncapsulationConcept {

	private int age;
	private String name;

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;

	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {

		this.age = age;

	}

	public static void main(String[] args) {

		EncapsulationConcept mm= new EncapsulationConcept();
		mm.setAge(20);
		mm.setName("akanshu");
		
		System.out.println(mm.getAge());
		System.out.println(mm.getName());
			
		
	}

}
