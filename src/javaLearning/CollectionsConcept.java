package javaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionsConcept {

	public static void main(String[] args) {
		List<String>list=  new ArrayList<String>(Arrays.asList("zombie","rahul", "sharma","akanshu"));

	Collections.sort(list);
		Collections.reverse(list);
	//	Collections.shuffle(list);
		System.out.println(list);
	
		

	}

}
