package javaLearning;

public class SwitchCase {

	public static void main(String[] args) {
		String browser = "chrome";
		/*
		 * switch( Browser) { case "chrome":
		 * System.out.println("Inititating the chrome browser code"); break; case
		 * "edge": System.out.println("Inititating the edge browser code"); break; case
		 * "firefox": System.out.println("Inititating the firefox browser code"); break;
		 * default : System.out.println("please check your browser name"); }
		 */

		switch (browser) {

		case "chrome":
			System.out.println("run the chrome browser");
			break;
		case "edge":
			System.out.println("run the edge browser");
			break;
		case "firefox":
			System.out.println("run the firefox browser");
			break;
		case "opera":
			System.out.println("run the opera browser");
			break;
		default:
			System.out.println("please run safari");
		}
	}

}
