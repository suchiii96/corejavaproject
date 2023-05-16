package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 ="Aneesh";
		String name2 ="Suji";
		String str= name1+name2;
		
		System.out.println("num of chrs in string is = " + str.length());
        System.out.println("char in 4th position is = " + name1.charAt(3));
        System.out.println("last char of string is = " + name1.charAt(name1.length()-1));
        System.out.println("string in uppercase is= " +name2.toUpperCase());
	}

}
