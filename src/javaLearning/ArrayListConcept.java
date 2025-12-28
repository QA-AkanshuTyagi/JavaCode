package javaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ArrayListConcept {

	String[] ss= new String[10];
	public static void main(String[] args) {
	
		

		ArrayList<String> ss= new ArrayList<String>(Arrays.asList("rahul","seema","lalaji","mitali1"));
		ArrayList<String>ss1=new ArrayList<String>();
		String []names= {"jeff", "rc","neha","shailesh","mitali"};
		//methods of arrayLists:
		
	/*ss.add("simran");
	ss.remove(0);
	ss.remove("seema");
	
	ss1.addAll(ss);
	System.out.println(ss1);
	ss.add("abhishek");
	System.out.println(ss);
   ss.removeAll(ss1);
  ss1.addAll(ss);
   System.out.println(ss1);
 boolean value=  ss.containsAll(ss1);
 
	System.out.println(value);
		
			System.out.println(ss); */
	
		
	
		ss1.addAll(ss);
		System.out.println(ss);
		System.out.println(ss1);
		
		System.out.println(ss.containsAll(ss1));
		System.out.println(ss.contains("rahul"));
		System.out.println(ss.size());
	//	ss.clear();
		System.out.println(ss);
	//	System.out.println(ss.size());
		System.out.println(ss.get(2));
		ss.set(0, "rahu123");
		System.out.println(ss);
		System.out.println(ss.indexOf("lalaji"));
		
		ListIterator<String> ss34= ss.listIterator();
		while(ss34.hasNext()) {
			
			System.out.println( ss34.next());
		}
		while(ss34.hasPrevious()) {
			System.out.println();
			
		}
		
	}
	

}
