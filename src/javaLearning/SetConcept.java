package javaLearning;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetConcept {

	public static void main(String[] args) {
		HashSet<String> ss= new HashSet<String>(Arrays.asList("rahul","sharma","naina"));
	HashSet<String> ss1= new HashSet<String>();
//List<String>ll= new ArrayList<String>(Arrays.asList("rahul","sharma","naina","rahul","sharma","naina"));
		System.out.println(ss);
		
	Iterator<String> ii =	ss.iterator();
	while(ii.hasNext()) {
		System.out.println( ii.next());
		
	}
	
	//	ss1.addAll(ss);
	//	System.out.println(ll);
		
	}

}
