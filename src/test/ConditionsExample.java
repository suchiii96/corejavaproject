package test;

import java.util.Scanner;

public class ConditionsExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the age");
		
		age=scanner.nextInt();
		
		if(age<17) {
			System.out.println("you are not eligible for voting");

	}
		else if(age==17) {
			System.out.println("you are eligible for voting in next year");
		}
		
		else{
			System.out.println("you are eligible for voting");
		}
  }
}

	
	
