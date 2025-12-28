package javaLearning;

public class Reversing_String {

	public static void main(String[] args) {
		
		String name= "my name is neelam";
		
		String output="";
		for (int i=name.length()-1;i>=0;i--) {
			
			output= output+name.charAt(i);
			
		}
		System.out.println(output);
		

	}

}
