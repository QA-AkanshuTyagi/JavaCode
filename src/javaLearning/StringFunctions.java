package javaLearning;

public class StringFunctions {

	public static void main(String[] args) {

		
		String a= "jef th is a good boy";
		String b=" Jeff ";
		
	/*	String[]keywords=a.split(" ");
		System.out.println(keywords);
	//	System.out.println(keywords[0]);
		System.out.println(keywords[0].replace('f',' ').trim());
		String updated = "";
	for(int i=0;i<keywords.length;i++) {
	
		if(i==0)
		{
			updated=keywords[i].replace('f',' ').trim();
		
		
		}else {
			updated=updated+" "+ keywords[i];	
		}
		
	
	
		
	
	}
	
	System.out.println(updated);
	*/	
	System.out.println(a.charAt(0));
	System.out.println(b.length());
	System.out.println(a.equals(b));	
	System.out.println(a.equalsIgnoreCase(b));
	System.out.println(a.toUpperCase());
	System.out.println(b.toLowerCase());	
	System.out.println(a.indexOf('f'));
	System.out.println(a.lastIndexOf('f'));
	
	System.out.println(b.trim());
	System.out.println(a.replace("jeffffffffff", "Neelam"));
	System.out.println(a.replace('f',' '));
	System.out.println(a.replace(' ','a'));
System.out.println(a.replaceAll("jeffffffffff", "rahul"));
System.out.println(a.startsWith("JEFF"));
System.out.println(a.substring(4,8));

System.out.println(a.contains(" b"));

System.out.println(a.concat(b).concat(" ramchandra ").concat(b));
	/*
	
		 * index	yes
length()	
equals()	
equalsignorecash()	
toUpperCase	
ToLoserCase	
charAT(Index)	
indexofchar()	
lastIndexOf	
trim	
replace(char ,char)	
replace(char seq,char seq)	
replaceAll(String regix,String)	
repeat	
Substring(start index)	
Substring(start index,end index)	
contains	
concat	

		 * 
		 */
		
	}

}
