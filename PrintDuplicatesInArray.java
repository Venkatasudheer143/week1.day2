package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int a[] = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int count;
		System.out.println("Duplicate Elements are");
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}

			}
			if (count > 0)
				System.out.println(a[i] + "--->" + count);
		} // outer for i

	}

}
