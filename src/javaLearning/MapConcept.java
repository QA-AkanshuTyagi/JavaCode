package javaLearning;

import java.io.ObjectOutputStream.PutField;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {

		Map<String, Integer> mm3 = new HashMap<String, Integer>();
		
		Map<String, Integer> mm = Map.of("one", 1, "two", 2);

		//==================================================================================
	//	Methods of map
		mm3.putAll(mm);
		System.out.println(mm3.size());
		System.out.println(mm.equals(mm3));
		
		System.out.println("Is key present?---->"+mm3.containsKey("one"));
		System.out.println("Is Value present?---->"+mm3.containsValue(1));
		//mm3.clear();
		System.out.println(mm3.isEmpty());
		
		System.out.println(mm3.keySet());
	//mm3.remove("one");
	//mm3.remove("one", 1);
	
	mm3.replace("two", 4);
	mm3.replace("one",1, 5);
	System.out.println("replaced"+"   "+ mm3);
		//==================================================================================
		/*
		 * Map<String,Integer> mm1= new HashMap<String, Integer>()
		 * 
		 * {{ put("rahul",26); put("neha",23); put("SHARMA",21);
		 * 
		 * 
		 * 
		 * }};
		 */
		System.out.println(mm3);
System.out.println(mm);
		/*
		 * Set<Entry<String,Integer>>mm1=mm.entrySet();
		 * Iterator<Entry<String,Integer>>mm4=mm1.iterator();
		 * 
		 * 
		 * while(mm4.hasNext()) { Entry<String,Integer>mm5=mm4.next();
		 * System.out.println( mm5.getValue());
		 * 
		 * }
		 */

//Iterator<Map.Entry<String,Integer>> mm1=mm.entrySet().iterator();

		
		
	}

}
