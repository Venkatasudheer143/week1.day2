package week1.day2;

import java.util.Arrays;

public class LargestAndSmallestNoArray {

	public static void main(String[] args) {

		int[] numArr = { 32, 456, 23, 1000, 1, 0 };

		int arrayLength = numArr.length;
		Arrays.sort(numArr);

		// access the array elements
		for (int i = 0; i < arrayLength; i++) {

			System.out.println("numArr[" + i + "]:" + numArr[i]);
		}

		// largest element in array
		System.out.println("Largest Element :" + numArr[arrayLength - 1]);

		System.out.println("Smallest Element: " + numArr[0]);
	}

}
