package week1.day2;

public class AmstrongNoCheck {

	public static void main(String[] args) {
		
		//amstrong number = 153,370,407
		int num=153;
		int calculate;
		int sum = 0;
		int remainder;
		int quotient;
		int original =num;
		while(num>0) {
			remainder =num%10;
			quotient=num/10;
			calculate = (remainder*remainder*remainder);
			sum=sum+calculate;
			num=quotient;
		}//while
		
		System.out.println("sum: "+sum);
		if(sum==original)
			System.out.println(original+" is a Amstrong Number");
		else
			System.out.println(original+" is not a Amstrong Number");

	}

}
