package test;

public class ArraysExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr1 = {10,20,30,40,50,60};
		
		System.out.println("length of array is " +arr1.length);
		System.out.println("First value inside array is "+ arr1[0]);
		System.out.println("Last value inside array is "+ arr1[arr1.length-1]);
		
		
		String[] arr2= {"monday","tuesday","wednesday","thursday","friday"};
		System.out.println("value at the third position is " + arr2[2]);
		
		
		String str = "clean world green world happy world";
		String[] arr3 =str.split(" ");
		System.out.println("Total number of words in string is " +arr3.length);
	}

}
