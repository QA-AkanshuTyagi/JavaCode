package javaLearning;

public class StringBufferConcept {

	public static void main(String[] args) {
	


		
		
StringBuilder sb= new StringBuilder("neha");
StringBuffer sb1= new StringBuffer("neha1");
sb.append("sharma");
System.out.println(sb);

sb.insert(1, "abc");
System.out.println(sb);

sb.replace(2, 4, "");
System.out.println(sb);
sb.replace(1, 3, "");
System.out.println(sb);
sb.insert(1, "e");
System.out.println(sb);
//sb.deleteCharAt(3);
//System.out.println(sb);

sb.reverse();
System.out.println(sb);

//sb.delete(2, 5);
//System.out.println(sb);
/*
 * 
 * nn.append("sharma");
System.out.println(nn);


nn.insert(1,"aaa");
System.out.println(nn);

nn.replace(2,3, "v");
System.out.println(nn);

nn.deleteCharAt(2);
System.out.println(nn);

nn.delete(1,3);
System.out.println(nn);

nn.reverse();
System.out.println(nn);
 * 
 * 
 */

		
		
		
		
		
		
		
		
}

}

