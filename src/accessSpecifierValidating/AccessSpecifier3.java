package accessSpecifierValidating;

import javaLearning.AccessSpecifier;
import javaLearning.AccessSpecifier2;

public class AccessSpecifier3 extends AccessSpecifier2   {

	public static void main(String[] args) {
		AccessSpecifier2 mmm= new AccessSpecifier2();
		mmm.name= "akanshu";
	AccessSpecifier.validatingAccessSpecifier();
		

	}
	public void m5() {
		AccessSpecifier2 mmm= new AccessSpecifier2();
		mmm.name= "akanshu";

		AccessSpecifier2.name= "akanshu";
		
	}

}
