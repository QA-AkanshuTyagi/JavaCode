package javaLearning;

import java.util.Scanner;

public class Revision1 {
	public static void main(String[] args) {

		String name = "Hi my name is rahul";
		String[] zz = name.split(" ");
		String rev2 = "";
		String rev3 = "";
		String reverse = "";
		for (int j = zz.length - 1; j >= 0; j--) {

			if (zz[j].equals("rahul")) {

				for (int i = zz[j].length() - 1; i >= 0; i--) {
					rev2 = rev2 + zz[j].charAt(i);

				}
				zz[j] = rev2;
			}
			if (zz[j].equals("Hi")) {

				for (int i = zz[j].length() - 1; i >= 0; i--) {
					rev3 = rev3 + zz[j].charAt(i);

				}
				zz[j] = rev3;
			}

			reverse = reverse + zz[j]+" ";

		}
		System.out.println(reverse);
	}
}
