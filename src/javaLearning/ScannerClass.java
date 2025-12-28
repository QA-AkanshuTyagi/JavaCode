package javaLearning;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();

		int sum = Math.addExact(a, b);
		int sub = Math.subtractExact(b, a);
		int multiply = Math.multiplyExact(sum,sub);
	    //int div=Math.divideExact(b, a);
		
		int minimum=Math.min(a, b);
        int max = Math.max(a,b);
        double pi=Math.PI;
        double  random=Math.random();

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multiply);
		System.out.println(minimum);
		System.out.println(max);
        System.out.println(random);
        System.out.println(pi);
        sc.close();
	}

}
