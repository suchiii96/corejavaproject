package test;

import java.util.Scanner;

public class ReverseExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the string: ");
		str = scanner.next();

		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);

		}
		System.out.println("reversed string is = " + result);

		if (str.equalsIgnoreCase(result)) {

			System.out.println("given string is palindrome");
		} else {
			System.out.println("given string is not palindrome");
		}
	}

}
