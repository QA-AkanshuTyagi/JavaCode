package javaLearning;

public class Try_CatchBlock {
	static int d;
	static int b = 0;

	public static void main(String[] args) throws Exception {
		try {

			int a = 10;

			int c = 12;
			String n = "abc";
			System.out.println(a);

			d = a / b;
			System.out.println(d);
			System.out.println(c);

		} catch (Exception e) {

			b = 1;
			System.out.println(d);
		} finally {
			System.out.println("hello guys ");
		}

	}

}
