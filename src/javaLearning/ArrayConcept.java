package javaLearning;

public class ArrayConcept {

	public static void main(String[] args) {
		String name="rahul";
		
		String [] names= new String[5];
		names[0] ="rahul";
		names[1] ="shivam";
		names[2] ="sachin";
		names[3] ="jeff";
		names[4] ="mitali";
		
for(int i=0;i<=names.length-1;i++) {
			
			System.out.println(names[i]);
			
			
		}
		

		String[] differentNames= {"neelam","jeff","shailesh","shashank","mitali","arabhaya","sonika","sushmita"};
 		
		System.out.println(differentNames.length);
		
	/*	System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		*/
		
		for(int i=0;i<=differentNames.length-1;i++) {
			
			System.out.println(differentNames[i]);
			
		}
		
		
	}

}
