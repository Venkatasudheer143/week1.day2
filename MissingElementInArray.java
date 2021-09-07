package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String args[]) {

		int[] arr = {1,2,3,4,7,6,8};

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != i+1) {
				System.out.println('\n'+"Missing Number arr["+i+"]: " + (i+1));
				break;
			}
		}

	}

	
	/*
	 * public static void main(String[] args) { int[] arr= {1,2,3,4,7,6,8};
	 * Arrays.sort(arr); for (int i = 0; i <= arr.length; i++) { if(arr[i] != i) {
	 * System.out.println("The array value is: "+ arr[i]+ " and iterative value is "
	 * + i); break; } }
	 * 
	 * }
	 */

}
