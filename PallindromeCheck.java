package week1.day2;

public class PallindromeCheck {

	public static void main(String[] args) {
		
		int num = 454;
		int temp =num;
		int reminder, quotient, rev=0;

		while(num!=0) {
			reminder = num%10;
			rev =rev*10+reminder;
			quotient = num/10;
			num =quotient;
			
		}//while
		
		if(rev==temp)
			System.out.println("Palindrome of the given number is "+rev);
		else
			System.out.println(rev+" is not a Palindrome number ");
		

	}

}
