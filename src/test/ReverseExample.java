package test;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "malayalam";
		String result = ""; // intial result is 0

		for (int i = str1.length() - 1; i >= 0; i--) { // here "i"should start from last index, and it should print
														// until i greater or equal to 0,then decrement( for reversing)
			result = result + str1.charAt(i);
		}
		System.out.println("reversed string is = " + result);

		if (str1.equalsIgnoreCase(result)) {

			System.out.println("given string is palindrome");
		} else {
			System.out.println("given string is not palindrome");
		}

		String str2 = "david meets john and lily";//swapping word in reverse
		String[] arr = str2.split(" ");
		String result1 = "";

		for (int i = arr.length-1; i >= 0; i--) {
			result1 = result1 + arr[i] + " ";
		}
		System.out.println("The result is " + result1.trim());//trim removes all the unnecessary spaces.
	}

}
