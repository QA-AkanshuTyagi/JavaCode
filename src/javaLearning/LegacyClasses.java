package javaLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LegacyClasses {

	public static void main(String[] args) {
Object name= "akanshu";
Vector vv= new Vector(List.of("akanshu","rahul"));
Enumeration ee= vv.elements();
Stack ss1= new Stack();
Collections.reverse(vv);
System.out.println(vv);
ss1.add("jeff");
ss1.add("rc");

Enumeration ee3=ss1.elements();
while(ee3.hasMoreElements()) {
	System.out.println( ee3.nextElement());
	
}

while(ee.hasMoreElements()) {
System.out.println(	ee.nextElement());
	
}
}
}