package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print 1 to 10 using while loop
		int num = 1;

		while (num < 11) {

			System.out.println(num);
			num++;

		}
		System.out.println("end of first while loop");

		// print 10 to 1
		int num1 = 10;

		while (num1 > 0) {
			if (num1 == 5) { // if you want to break the loop as soon you find the value.
				System.out.println("stop");
				num1--;
				break;
			}
			// while(num1>0) {
			// if (num1==5) { //if you want to skip value 5 and then continue.(here loop
			// will print until 6 and skip 5 and print value"skip",then it goes back to
			// while loop and print remaining values.
			// System.out.println("skip");
			// num1--;
			// continue;
			// }
			// }

			System.out.println(num1);
			num1--;
		}
		System.out.println("end of second while loop");

		

		
		String str1 = "John is from US";

		for (int i = 0; i < str1.length(); i++) {

			System.out.println("");
		}
	}

}
