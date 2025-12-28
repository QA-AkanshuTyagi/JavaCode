package javaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class IteratorConcept {

	public static void main(String[] args) {

		ArrayList<String> ss = new ArrayList<String>(
				Arrays.asList("rahul", "jeff", "rc", "neha", "shailesh", "mitali"));

		String[] names = { "jeff", "rc", "neha", "shailesh", "mitali" };

		/*
		 * for (int i = 0; i < names.length; i++) {
		 * 
		 * System.out.println(names[i]);
		 * 
		 * }
		 */
		/*
		 * Iterator<String> it= ss.iterator();
		 * 
		 * while(it.hasNext()) { String next= it.next(); System.out.println(next);
		 * 
		 * }
		 */

		ListIterator<String> ls = ss.listIterator();

		while (ls.hasNext()) {

			System.out.println(ls.next());
		}

		while (ls.hasPrevious()) {

			System.out.println(ls.previous());
		}

	}
}
