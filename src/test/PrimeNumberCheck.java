package test;

public class PrimeNumberCheck {// number is said to be prime if only it is divisible by 1 and number itself.if
								// it is completly divisble by any other number within that range then it is
								// not an prime number,ie expect 1 and that number,a reminder should come when
								// it is divisble by another number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 17;
		boolean flag = true;

		for (int i = 2; i < number; i++) {
			// for (int i = 2; i <= number / 2; i++) {// .this is needed when we want to
			// check
			// a larger no.is prime/not eg:50.after 25 no number can completely divide 50.so
			// it
			// is not necessary to check up to 50.
			int rem = number % i;

			if (rem == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");// in this code the number 17 will be checked as prime or not by
														// dividing it by i(ie 2,3,4, etc..).if any of numbers till 16
														// is get not completly divisible then it will end the" for
														// loop" and flag become true and go to "if loop" and codition
														// flag==true satisfied and print number is prime. otherwise if
														// rem==0,then goes to "if loop" and the flag become false and
														// then to else statement and print no.is not prime
		}

	}

}
