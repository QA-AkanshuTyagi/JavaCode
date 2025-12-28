package javaLearning;

public class MathClass {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int sum = Math.addExact(a, b);
		int sub = Math.subtractExact(b, a);
		int multiply = Math.multiplyExact(sum, sub);
	//	int div=Math.divideExact(b, a);
		
		int minimum=Math.min(a, b);
int max = Math.max(a, b);
double pi=Math.PI;

double  random=Math.random();

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multiply);
		System.out.println(minimum);
		System.out.println(max);
System.out.println(random);
System.out.println(pi);
	}

}
