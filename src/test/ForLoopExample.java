package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int num = 1; num < 11; num++) {
			System.out.println(num);
		}
		System.out.println("end of for loop");
		// for(int num1=10;num1>0;num1--) { //for decrementing

		for (int num1 = 10; num1 > 0; num1 -= 2) { // for printing even numbers
			System.out.println(num1);
		}
		System.out.println("end of second for loop");

		int[] arr1 = { 2, 3, 4, 6, 8, 9 };
		for (int i = 0; i < arr1.length; i++) { // here intial value of index is taken as 0,then its should print by
												// length of array,then array index is incrememted by i++

			System.out.println("Element value is" + arr1[i]);// in above for loop you should not give i<=arr1.length,bcz
																// leng of array here is 6 but index is 5.
		}
		// for each loop (only for array)(simple way of above code) 
		for (int va1 : arr1) { //here variable va1 will take all the values of arr1 and print it.
			System.out.println("value is" + va1);

		}
		String str1 = "John is from US";

		for (int i=0; i<str1.length(); i++) {

			System.out.println("char value is "+ str1.charAt(i));
		}

	}

}
