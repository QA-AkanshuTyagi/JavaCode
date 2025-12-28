package javaLearning;

public class ReturnType {

	public static void main(String[] args) {
		ReturnType vv= new ReturnType();
System.out.println(vv.party());
vv.pay();
System.out.println(vv.azamBirthday()+vv.neelamBirthday()+vv.mitaliBirthDay());
	}

	
	public String m1() {
		int a=10;
		String abc= "mitali";
		System.out.println(a);
		return abc;
		
	}
	public int azamBirthday() {
		
		int budget=2000;
		return budget;
	}
	public int neelamBirthday() {
		int budget= 10000;
		return budget;
	}
	public int mitaliBirthDay() {
		int budget=5000;
		
		return budget;
	}
	public int party() {
	int sum =	azamBirthday()+neelamBirthday()+mitaliBirthDay();
	
	return sum;
	}
	
	public void pay() {
		party();
	}
	
}
