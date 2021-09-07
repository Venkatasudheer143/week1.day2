package week1.day2;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {

		int number = 143567;
		int sum = 0, remainder = 0, quotient = 0;

		while (number != 0) {
			quotient = number / 10;
			remainder = number % 10;
			sum = sum + remainder;
			number = quotient;
		} // while
		System.out.println("Sum of Digits: "+sum);
	}

}
